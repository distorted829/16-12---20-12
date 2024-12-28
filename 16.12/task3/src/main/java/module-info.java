module ru.kozin.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.task3 to javafx.fxml;
    exports ru.kozin.task3;
}