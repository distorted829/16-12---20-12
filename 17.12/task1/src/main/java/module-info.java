module ru.kozin.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.task1 to javafx.fxml;
    exports ru.kozin.task1;
}