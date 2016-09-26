package assignment03.dmeadows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.net.URL;

/**
 * Dylan Meadows
 * CS4712 - User Interface Engineering
 * Section W01
 * Assignment 3
 * 09/26/2016
 */
public class Assignment03 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Microsoft Word");
        alert.setHeaderText(null);
        alert.setContentText("You must enter your name");
        alert.showAndWait();

        alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Norton Utility");
        alert.setHeaderText(null);
        alert.setContentText("Do you really want to erase your hard disk?");
        alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        URL resource = getClass().getResource("LoginPane.fxml");
        FXMLLoader loader = new FXMLLoader(resource);

        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Login");
        alert.setHeaderText(null);
        alert.setDialogPane(loader.load());
        alert.setHeight(100);
        ButtonType login = new ButtonType("Login", ButtonBar.ButtonData.OK_DONE);
        alert.getButtonTypes().setAll(login, ButtonType.CANCEL);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
