module ru.kozin.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.task4 to javafx.fxml;
    exports ru.kozin.task4;
}