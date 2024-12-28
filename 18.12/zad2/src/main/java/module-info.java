module ru.kozin.zad2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kozin.zad2 to javafx.fxml;
    exports ru.kozin.zad2;
}