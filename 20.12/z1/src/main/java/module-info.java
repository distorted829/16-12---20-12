module ru.kozin.z1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.z1 to javafx.fxml;
    exports ru.kozin.z1;
}