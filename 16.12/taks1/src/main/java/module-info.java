module ru.kozin.taks1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.taks1 to javafx.fxml;
    exports ru.kozin.taks1;
}