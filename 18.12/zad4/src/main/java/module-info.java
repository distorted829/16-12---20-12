module ru.kozin.zad4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.zad4 to javafx.fxml;
    exports ru.kozin.zad4;
}