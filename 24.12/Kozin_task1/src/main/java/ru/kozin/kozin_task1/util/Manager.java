package ru.kozin.kozin_task1.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import ru.kozin.kozin_task1.HelloApplication;


import java.io.IOException;
import java.util.Stack;


public class Manager {
    public static Stage mainStage;
    private static Stack<Scene> sceneStack = new Stack<>();


    public static void showMainStage(Stage stage, String fxmlFileName) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene((scene));
            stage.setTitle("MARATHON SKILLS 2016");
            stage.setMinWidth(300);
            stage.setMinHeight(200);
            stage.setResizable(false);
            mainStage = stage;
            sceneStack.push(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showSecondStage(String fxmlFileName) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            mainStage.setResizable(false);
            mainStage.setScene((scene));
            mainStage.setTitle("MARATHON SKILLS 2016");
            sceneStack.push(scene);
            mainStage.setScene(scene);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void goBack(Stage stage) {
        if (sceneStack.size() > 1) {
            sceneStack.pop();
            Scene previousScene = sceneStack.peek();
            stage.setScene(previousScene);
        }
    }

    public static void showSsecondStage(String fxmlFileName) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            Stage modalStage=new Stage();
            modalStage.initModality(Modality.APPLICATION_MODAL);
            modalStage.setResizable(false);
            modalStage.setTitle("MARATHON SKILLS 2016");
            modalStage.setScene(scene);
            modalStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}