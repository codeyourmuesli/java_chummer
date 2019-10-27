package com.shadow.controller;

import com.shadow.view.FXController;
import com.shadow.view.FXWindow;
import com.shadow.view.View;
import javafx.scene.Scene;

/**
 * Created by felix on 01.02.18.
 */
public class Main {
    public static void main(String args[]){
        Main m = new Main();
    }
    public Main(){
        //XMLRessourceLoader xml = new XMLRessourceLoader();
        //System.out.println(xml.loadSkills().toString());
        XMLCharacterLoader xml_handler= new XMLCharacterLoader("");
        System.out.println(xml_handler.getCreatedCharacter().toString());

        FXWindow fxw = View.startFxWindow();

        //RunnerGenerator rg = new RunnerGenerator();
        //rg.generate();
    }
}
