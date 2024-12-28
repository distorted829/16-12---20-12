package ru.kozin.taks1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private TextField cTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    private Label result;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
float a=Float.parseFloat(aTextField.getText().toString());
float b=Float.parseFloat(bTextField.getText().toString());
float c=Float.parseFloat(cTextField.getText().toString());
resLabel.setText("V="+ (a*b*c));
result.setText("S="+2*(a*b+b*c+a*c));
    }

}
