package com.shadow.controller;

import com.shadow.view.View;

/**
 * Created by felix on 01.02.18.
 */
public class Main {
    public static void main(String args[]){
        Main m = new Main();
    }
    public Main(){
        XMLCharacterLoader xml_handler= new XMLCharacterLoader("");
        System.out.println("Char ende");
        System.out.println(xml_handler.getCreatedCharacter().toString());
        View.startFxWindow();
        //RunnerGenerator rg = new RunnerGenerator();
        //rg.generate();
    }
}
