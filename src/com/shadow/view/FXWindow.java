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
    public void begin(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainMenue.fxml"));
        primaryStage.setTitle("Chummer");
        primaryStage.setScene(new Scene(root, 1200, 900));
        primaryStage.show();
    }
}
