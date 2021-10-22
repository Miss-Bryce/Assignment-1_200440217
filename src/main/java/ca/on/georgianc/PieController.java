package ca.on.georgianc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import utilities.DBUtility;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PieController implements Initializable {

    public Stage stage;
    public Scene scene;
    public Parent root;

    @FXML
    public PieChart comicPie;

    @FXML
    public Button changeButton;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();;

        for (SuperheroShare superheroShare : DBUtility.getSharePercentage()) {
            pieChartData.add(new PieChart.Data(superheroShare.getSuperhero(), superheroShare.getPercentageShare()));
        }

        comicPie.setData(pieChartData);
    }

    public void switchToTable(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("tableview.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

}
