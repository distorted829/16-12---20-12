module ru.kozin.taskkkkk {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.taskkkkk to javafx.fxml;
    exports ru.kozin.taskkkkk;
}