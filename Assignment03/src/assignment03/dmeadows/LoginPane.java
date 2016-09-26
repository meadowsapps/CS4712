package assignment03.dmeadows;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Dylan Meadows
 * CS4712 - User Interface Engineering
 * Section W01
 * Assignment 3
 * 09/26/2016
 */
public class LoginPane {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    public void initialize() {
        usernameField.setPromptText("Username");
        passwordField.setPromptText("Password");
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return passwordField.getText();
    }

}
