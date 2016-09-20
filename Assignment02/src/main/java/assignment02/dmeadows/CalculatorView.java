package assignment02.dmeadows;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Created by dmeadows on 9/20/16.
 */
public class CalculatorView {

    @FXML
    private TextField displayField;

    @FXML
    public void onNumeric(ActionEvent e) {
        Button button = (Button) e.getSource();
        System.out.println(button.getText());
    }

    @FXML
    public void onControl(ActionEvent e) {
        Button button = (Button) e.getSource();
        System.out.println(button.getText());
    }

}
