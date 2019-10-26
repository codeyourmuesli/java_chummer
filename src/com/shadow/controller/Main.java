package com.shadow.controller;

import com.shadow.model.XML_Char;
import com.shadow.view.FXController;
import com.shadow.view.FXWindow;
import com.shadow.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by felix on 01.02.18.
 */
public class Main {
    public static void main(String args[]){
        Main m = new Main();
    }
    public Main(){
        XMLHandler xml_handler= new XMLHandler("");
        System.out.println("Char ende");
        System.out.println(xml_handler.getLoaded_char().xml_Attributes.toString());
        View.startFxWindow();
        //RunnerGenerator rg = new RunnerGenerator();
        //rg.generate();
    }
}
