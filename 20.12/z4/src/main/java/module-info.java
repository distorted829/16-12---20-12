module ru.kozin.z4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.z4 to javafx.fxml;
    exports ru.kozin.z4;
}