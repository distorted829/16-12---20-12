module ru.kozin.zad5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.zad5 to javafx.fxml;
    exports ru.kozin.zad5;
}