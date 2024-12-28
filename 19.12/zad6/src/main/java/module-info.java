module ru.kozin.zad6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.zad6 to javafx.fxml;
    exports ru.kozin.zad6;
}