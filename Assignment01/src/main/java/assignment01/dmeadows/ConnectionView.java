package assignment01.dmeadows;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by dmeadows on 9/20/16.
 */
public class ConnectionView {

    @FXML
    private TextField ipAddressField;

    @FXML
    private TextField portField;

    @FXML
    private CheckBox sslField;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button connectBtn;

    @FXML
    private Button cancelBtn;

    @Override
    public String toString() {
        String result = "{IpAddress:" + ipAddressField.getText() + ","
                + "Port:" + portField.getText() + ","
                + "UseSSL:" + sslField.isSelected() + ","
                + "Username:" + usernameField.getText() + ","
                + "Password:" + passwordField.getText() + "}";
        return result;
    }

    @FXML
    public void onConnect(ActionEvent e) {
        System.out.println("Connecting...");
        System.out.println(toString());
        Stage stage = (Stage) connectBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void onCancel(ActionEvent e) {
        System.out.println("Closing...");
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }

}
