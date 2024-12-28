package ru.kozin.zadanie3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button calculateButton;

    @FXML
    private Label dayOfWeekLabel;

    @FXML
    private TextField dayOfYearField;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        try {
            int dayOfYear = Integer.parseInt(dayOfYearField.getText());

            if (dayOfYear < 1 || dayOfYear > 365) {
                dayOfWeekLabel.setText("Введите число от 1 до 365");
                return;
            }

            // 1 января - понедельник (индекс 1)
            int dayOfWeekIndex = (dayOfYear + 0) % 7;  // 1 января - понедельник(с индексом 1, но в коде нужно 0), потому + 0

            String dayOfWeek;
            switch (dayOfWeekIndex) {
                case 0:
                    dayOfWeek = "Воскресенье";
                    break;
                case 1:
                    dayOfWeek = "Понедельник";
                    break;
                case 2:
                    dayOfWeek = "Вторник";
                    break;
                case 3:
                    dayOfWeek = "Среда";
                    break;
                case 4:
                    dayOfWeek = "Четверг";
                    break;
                case 5:
                    dayOfWeek = "Пятница";
                    break;
                case 6:
                    dayOfWeek = "Суббота";
                    break;
                default:
                    dayOfWeek = "Неизвестно"; // Этого не должно произойти
                    break;
            }

            dayOfWeekLabel.setText("День недели: " + dayOfWeek);

        } catch (NumberFormatException e) {
            dayOfWeekLabel.setText("Некорректный ввод");
        }
    }
}
