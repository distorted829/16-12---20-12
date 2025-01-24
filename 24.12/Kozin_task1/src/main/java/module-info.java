module ru.kozin.kozin_task {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.kozin.kozin_task1 to javafx.fxml;
    exports ru.kozin.kozin_task1;
    exports ru.kozin.kozin_task1.controller;
    opens ru.kozin.kozin_task1.controller to javafx.fxml;
}