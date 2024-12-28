package ru.kozin.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField x1Field;

    @FXML
    private TextField y1Field;

    @FXML
    private TextField x2Field;

    @FXML
    private TextField y2Field;

    @FXML
    private Button resButton;

    @FXML
    private Label areaLabel;

    @FXML
    private Label perimeterLabel;
    @FXML
    public void calculateRectangle() {
        try {
            int x1 = Integer.parseInt(x1Field.getText());
            int y1 = Integer.parseInt(y1Field.getText());
            int x2 = Integer.parseInt(x2Field.getText());
            int y2 = Integer.parseInt(y2Field.getText());

            // стороны прямоугольника
            int a = Math.abs(x2 - x1);
            int b = Math.abs(y2 - y1);

            // площадь
            int area = a * b;

            // периметр
            int perimeter = 2 * (a + b);

            areaLabel.setText("Площадь: " + area);
            perimeterLabel.setText("Периметр: " + perimeter);

        } catch (NumberFormatException e) {
            areaLabel.setText("Некорректный ввод");
            perimeterLabel.setText("Некорректный ввод");
        }
    }
}