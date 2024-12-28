module ru.kozin.z2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.z2 to javafx.fxml;
    exports ru.kozin.z2;
}