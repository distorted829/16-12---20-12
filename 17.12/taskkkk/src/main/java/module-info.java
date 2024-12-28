module ru.kozin.taskkkk {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.taskkkk to javafx.fxml;
    exports ru.kozin.taskkkk;
}