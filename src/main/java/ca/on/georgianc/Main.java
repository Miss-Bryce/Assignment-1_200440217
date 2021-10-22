package ca.on.georgianc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import utilities.DBUtility;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //primaryStage.getIcons().add(new Image("../dc.png"));
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("piechart.fxml"));
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}