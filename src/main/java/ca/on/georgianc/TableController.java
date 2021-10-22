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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import utilities.DBUtility;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TableController implements Initializable {

    public Stage stage;
    public Scene scene;
    public Parent root;

    @FXML
    public Button changeButton;

    @FXML
    public TableView<Comic> tableView;

    @FXML
    public TableColumn<Comic, Integer> id;
    @FXML
    public TableColumn<Comic, String> comicName;
    @FXML
    public TableColumn<Comic, String>  charGrouping;
    @FXML
    public TableColumn<Comic, Integer> numPerMonth;





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        comicName.setCellValueFactory(new PropertyValueFactory<>("comicName"));
        charGrouping.setCellValueFactory(new PropertyValueFactory<>("charGrouping"));
        numPerMonth.setCellValueFactory(new PropertyValueFactory<>("numPerMonth"));

        tableView.getItems().addAll(DBUtility.getComicDetails());

    }


    public void switchToPieChart(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("piechart.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }
}
