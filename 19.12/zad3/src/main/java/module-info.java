module ru.kozin.zad3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.zad3 to javafx.fxml;
    exports ru.kozin.zad3;
}