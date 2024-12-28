module ru.kozin.zad1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.zad1 to javafx.fxml;
    exports ru.kozin.zad1;
}