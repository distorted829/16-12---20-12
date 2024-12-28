package ru.kozin.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button calculateButton;

    @FXML
    private Label secondsSinceLastMinuteLabel;

    @FXML
    private TextField totalSecondsField;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        try {
            int totalSeconds = Integer.parseInt(totalSecondsField.getText());

            if (totalSeconds < 0) {
                secondsSinceLastMinuteLabel.setText("Введите положительное число");
                return;
            }

            int secondsSinceLastMinute = totalSeconds % 60;

            secondsSinceLastMinuteLabel.setText("Секунд с начала последней минуты: " + secondsSinceLastMinute);
        } catch (NumberFormatException e) {
            secondsSinceLastMinuteLabel.setText("Некорректный ввод");
    }
}
}
