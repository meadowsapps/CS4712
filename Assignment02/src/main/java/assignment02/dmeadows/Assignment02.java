package assignment02.dmeadows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

/**
 * Created by dmeadows on 9/20/16.
 */
public class Assignment02 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculator");
        URL location = getClass().getClassLoader().getResource("CalculatorView.fxml");
        Parent root = FXMLLoader.load(location);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
