package com.shadow.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by felix on 05.02.18.
 */
public class FXWindow extends Application {

    private Stage primaryStage;
    private Scene scene;

    public void begin(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("MainMenue.fxml"));
        primaryStage.setTitle("Chummer");
        scene = new Scene(root, 1200, 900);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
