module ru.kozin.zadanie3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.zadanie3 to javafx.fxml;
    exports ru.kozin.zadanie3;
}