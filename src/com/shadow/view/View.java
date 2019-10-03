package com.shadow.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Created by felix on 02.02.18.
 */
public class View {
    BufferedReader bufferedReader;
    public View(){
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    }
    public int getInputInt(String arg) {
        int back = 0;
        System.out.println(arg);
        try {
            String input = bufferedReader.readLine();
            back = parseInt(input,10);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return back;
    }
    public static void startFxWindow(){
        FXWindow fxw = new FXWindow();
        fxw.begin(null);
    }

    public String getInputString(String arg) {
        System.out.println(arg);
        String input = "";
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
