package ru.kozin.kozin_task1;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import static ru.kozin.kozin_task1.util.Manager.showMainStage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showMainStage(stage, "gl-view.fxml");

    }

    public static void main(String[] args) {

        launch();
    }

}


