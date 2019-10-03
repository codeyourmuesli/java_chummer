package com.shadow.controller;

import com.shadow.view.View;

/**
 * Created by felix on 02.02.18.
 */
public class RunnerGenerator {
    View view = new View();
    /*
    public Runner generate(){
        String name = view.getInputString("name");
        String metatypS = view.getInputString("Metatyp");
        int metatyp = parseMetatyp(metatypS);
        Runner runner = new Runner(name,metatyp);
        runner.setAlias(view.getInputString("Alias"));
        runner.setAge(view.getInputInt("Age"));
        runner.setSex(parseSex(view.getInputString("Sex")));
        runner.setSize(view.getInputInt("size"));
        runner.setWeight(view.getInputInt("weight"));
        runner.setEyecolor(view.getInputString("eyecolor"));
        runner.setHaircolor(view.getInputString("haircolor"));
        runner.setSkincolor(view.getInputString("skincolor"));
        int[] kkr = new int[6];
        kkr[0] = view.getInputInt("Kontostand");
        kkr[1] = view.getInputInt("Karma Ges");
        kkr[2] = view.getInputInt("Karma akt");
        kkr[3] = view.getInputInt("Strassenruf");
        kkr[4] = view.getInputInt("Schlechter Ruf");
        kkr[5] = view.getInputInt("prominenz");
        runner.setKonto_Karma_ruf(kkr);
        int[] attribute = new int[16];
        attribute[0] = view.getInputInt("Konstitution");
        attribute[1] = view.getInputInt("Geschick");
        attribute[2] = view.getInputInt("Reaktion");
        attribute[3] = view.getInputInt("Staerke");
        attribute[4] = view.getInputInt("Charisma");
        attribute[5] = view.getInputInt("Intuition");
        attribute[6] = view.getInputInt("Logik");
        attribute[7] = view.getInputInt("Willenskraft");
        attribute[8] = view.getInputInt("Edge_gesamt");
        attribute[9] = view.getInputInt("Edge_aktuell");
        attribute[10] = view.getInputInt("Essenz");
        attribute[11] = view.getInputInt("Resonanz");
        attribute[12] = view.getInputInt("Initiative");
        attribute[13] = view.getInputInt("Matrix_Initiative");
        attribute[14] = view.getInputInt("Initiative_durchgaenge");
        attribute[15] = view.getInputInt("Matrix_Initiative_durchgange");
        runner.setAttr(attribute);
        int x = view.getInputInt("anzahl_fertigkeiten");
        Triple[] fert = new Triple[x];
        for (int i =0; i<x; i++){
            Triple<String,Integer,Integer> t = new Triple(view.getInputString("fert_name"),view.getInputInt("fert_wert"),view.getInputInt("fert_attr"));  //(String name,int wert, int attr)
            fert[i] = t;
        }
        runner.setFertigkeiten(fert);
        x = view.getInputInt("anzahl_wiss_fertigkeiten");
        Triple[] wfert = new Triple[x];
        for (int i =0; i<x; i++){
            Triple<String,Integer,Integer> t = new Triple(view.getInputString("fert_name"),view.getInputInt("fert_wert"),view.getInputInt("fert_attr"));  //(String name,int wert, int attr)
            fert[i] = t;
        }
        runner.setWissensfertigkeiten(wfert);
        x = view.getInputInt("anzahl_gaben_handycaps");
        int[] gh = new int[x];
        for (int i = 0;i<x;i++){
            int gabe = parseGabe(view.getInputString("gabe/handycap"));
            gh[i] = gabe;
        }
        runner.setGaben_handycaps(gh);
        System.out.println(runner.toString());
        return runner;
    }
    */

    private int parseGabe(String inputString) {
        return 0;
    }

    private int parseSex(String sex) {
        return 0;
    }

    private int parseMetatyp(String s) {
        return 0;
    }
    /*
    private Connection[] connections;
    private ComplexForm[] complexForms;
     */
}
