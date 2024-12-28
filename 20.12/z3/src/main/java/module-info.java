module ru.kozin.z3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.z3 to javafx.fxml;
    exports ru.kozin.z3;
}