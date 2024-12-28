module ru.kozin.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.task2 to javafx.fxml;
    exports ru.kozin.task2;
}