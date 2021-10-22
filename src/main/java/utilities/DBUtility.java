package utilities;

import ca.on.georgianc.Comic;
import ca.on.georgianc.SuperheroShare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtility {
    private static String user = "student";
    private static String pw = "student";
    private static String connectUrl = "jdbc:mysql://localhost:3306/comicsdatabase";

    public static ArrayList<Comic> getComicDetails()
    {
        ArrayList<Comic> comics = new ArrayList<>();

        String sql = "SELECT id, comicname, chargrouping, numpermonth FROM dccomics;";

        //use the try with resources ensure that anything opened in the ( ... ) will be closed
        try(
                Connection conn = DriverManager.getConnection(connectUrl, user,pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next())
            {
                int id = resultSet.getInt("id");
                String comicname = resultSet.getString("comicName");
                String chargrouping = resultSet.getString("charGrouping");
                int numpermonth = resultSet.getInt("numPerMonth");

                Comic comic = new Comic(id, comicname,chargrouping,numpermonth);

                comics.add(comic);
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return comics;
    }

    public static ArrayList<SuperheroShare> getSharePercentage()
    {
        ArrayList<SuperheroShare> superShare = new ArrayList<>();

        String sql = "SELECT chargrouping, FLOOR(count(id) / (SELECT COUNT(*) FROM dccomics) * 100) AS percentage FROM dccomics GROUP BY chargrouping;";

        //use the try with resources ensure that anything opened in the ( ... ) will be closed
        try(
                Connection conn = DriverManager.getConnection(connectUrl, user,pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next())
            {
                SuperheroShare share = new SuperheroShare(resultSet.getString("chargrouping"),resultSet.getInt("percentage"));

                superShare.add(share);
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return superShare;
    }

}
