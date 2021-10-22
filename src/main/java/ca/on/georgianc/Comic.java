package ca.on.georgianc;

public class Comic {

    private int id;
    private String comicName;
    private String charGrouping;
    private int numPerMonth;

    public Comic (int id, String comicName, String charGrouping, int numPerMonth){
        setId(id);
        setComicName(comicName);
        setCharGrouping(charGrouping);
        setNumPerMonth(numPerMonth);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }

    public String getCharGrouping() {
        return charGrouping;
    }

    public void setCharGrouping(String charGrouping) {
        this.charGrouping = charGrouping;
    }
    public int getNumPerMonth() {
        return numPerMonth;
    }

    public void setNumPerMonth(int numPerMonth) {
        this.numPerMonth = numPerMonth;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "id=" + id +
                ", comicName='" + comicName + '\'' +
                ", charGrouping='" + charGrouping + '\'' +
                ", numPerMonth=" + numPerMonth +
                '}';
    }
}
