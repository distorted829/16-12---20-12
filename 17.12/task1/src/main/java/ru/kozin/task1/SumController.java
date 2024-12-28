package ru.kozin.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField numberField;

    @FXML
    private Button splitButton;

    @FXML
    private Label tensLabel;

    @FXML
    private Label unitsLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        try {
            int number = Integer.parseInt(numberField.getText());

            if (number < 10 || number > 99) {
                tensLabel.setText("Введите двузначное число");
                unitsLabel.setText("");
                return;
            }


            int tens = number / 10;
            int units = number % 10;

            tensLabel.setText("Десятки: " + tens);
            unitsLabel.setText("Единицы: " + units);
        } catch (NumberFormatException e) {
            tensLabel.setText("Некорректный ввод");
            unitsLabel.setText("");
        }
    }
}



