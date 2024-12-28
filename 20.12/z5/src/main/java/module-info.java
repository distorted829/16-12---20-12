module ru.kozin.z5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.z5 to javafx.fxml;
    exports ru.kozin.z5;
}