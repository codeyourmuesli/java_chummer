package com.shadow.controller;

import com.shadow.model.Gear.DistanceWeapon;
import com.shadow.model.Gear.MeeleWeapon;
import com.shadow.model.Gear.Weapon;
import com.shadow.model.Quality;
import com.shadow.model.Skill;
import com.shadow.model.UsedAttribute;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class XMLRessourceLoader {

    public XMLRessourceLoader(){

    }
    private String xmlQualitiesFile = "sources/qualities.xml";
    private String xmlSkillsFile = "sources/skills.xml";
    private String xmlWeaponFile = "sources/weapon.xml";
    public List<Skill> loadSkills(){
        List<Skill> skills = new ArrayList<>();
        try {
            HashMap<String,Object> myMap = XMLLoadingHandler.parseFile(xmlSkillsFile);
            //überspringe äußere listen
            while(myMap.keySet().size() ==  1)
                myMap = (HashMap<String,Object>) myMap.get(myMap.keySet().toArray()[0]);
            if (!myMap.keySet().contains("skill")){
                throw new ValueException("key 'skill' not found");
            }
            for (String key : myMap.keySet()) {

                if (key.startsWith("skill")) {
                    //parse the <skill> inside of <skills>
                    HashMap<String, Object> attributeMap = (HashMap<String, Object>) myMap.get(key);
                    Skill currentSkill = new Skill();
                    boolean hasValue[] = new boolean[7];
                    String val;
                    for (String skillKey : attributeMap.keySet()) {
                        switch (skillKey) {
                            case "id":
                                currentSkill.setId((String) attributeMap.get(skillKey));
                                hasValue[0] = true;
                                break;
                            case "name":
                                currentSkill.setName((String) attributeMap.get(skillKey));
                                hasValue[0] = true;
                                break;
                            case "description":
                                currentSkill.setDescription((String) attributeMap.get(skillKey));
                                hasValue[1] = true;
                                break;
                            case "skillgroup":
                                currentSkill.setSkillgroup((String) attributeMap.get(skillKey));
                                break;
                            case "skillcategory":
                                currentSkill.setSkillcategory((String) attributeMap.get(skillKey));
                                hasValue[2] = true;

                                break;
                            case "knowledge":
                                val = (String) attributeMap.get(skillKey);
                                currentSkill.setKnowledge(Boolean.parseBoolean(val));
                                hasValue[3] = true;
                                break;
                            case "exotic":
                                val = (String) attributeMap.get(skillKey);
                                currentSkill.setExotic(Boolean.parseBoolean(val));
                                hasValue[4] = true;
                                break;
                            case "allowdelete":
                                val = (String) attributeMap.get(skillKey);
                                currentSkill.setAllowdelete(Boolean.parseBoolean(val));
                                hasValue[5] = true;
                                break;
                            case "attribute":
                                currentSkill.setAttribute((String) attributeMap.get(skillKey));
                                hasValue[6] = true;
                                break;
                            case "source":
                                //currentSkill.setSource((String)attributeMap.get(key));
                                break;
                            case "page":
                                //currentSkill.setPage((String)attributeMap.get(key));
                                break;
                        }
                    }
                    // skill should have the values:
                    // id, name, description, skillgroup, skillcategory, knowledge, exotic, allowdelete, attribute
                    for (boolean bool : hasValue) {
                        if (!bool) throw new ValueException("Missing key in skills");
                    }
                    skills.add(currentSkill);
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return skills;
    }


    public List<Quality> loadQualities(){
        List<Quality> qualities = new ArrayList<>();
        try {
            HashMap<String,Object> myMap = XMLLoadingHandler.parseFile(xmlQualitiesFile);
            //überspringe äußere listen
            while(myMap.keySet().size() ==  1)
                myMap = (HashMap<String,Object>) myMap.get(myMap.keySet().toArray()[0]);
            if (!myMap.keySet().contains("quality")){
                throw new ValueException("key 'skill' not found");
            }
            for (String key : myMap.keySet()) {

                if (key.startsWith("quality")) {
                    //parse the <skill> inside of <skills>
                    HashMap<String, Object> attributeMap = (HashMap<String, Object>) myMap.get(key);
                    Quality currentQuality = new Quality();
                    boolean hasValue[] = new boolean[5];
                    for (boolean bool : hasValue) {
                        bool = false;
                    }
                    String val;
                    for (String qualityKey : attributeMap.keySet()) {
                        switch (qualityKey) {
                            case "id":
                                currentQuality.setId((String) attributeMap.get(qualityKey));
                                hasValue[0] = true;
                                break;
                            case "name":
                                currentQuality.setName((String) attributeMap.get(qualityKey));
                                hasValue[1] = true;
                                break;
                            case "description":
                                currentQuality.setDescription((String) attributeMap.get(qualityKey));
                                hasValue[2] = true;
                                break;
                            case "bp":
                                val = (String) attributeMap.get(qualityKey);
                                currentQuality.setBpCost(Integer.parseInt(val));
                                hasValue[3] = true;
                                break;
                            case "qualitytype":
                                currentQuality.setAlignment((String) attributeMap.get(qualityKey));
                                hasValue[4] = true;
                                break;
                            case "source":
                                //currentSkill.setSource((String)attributeMap.get(key));
                                break;
                            case "page":
                                //currentSkill.setPage((String)attributeMap.get(key));
                                break;
                        }
                    }
                    // skill should have the values:
                    // id, name, description, skillgroup, skillcategory, knowledge, exotic, allowdelete, attribute
                    for (boolean bool : hasValue) {
                        if (!bool) throw new ValueException("Missing key in skills");
                    }
                    qualities.add(currentQuality);
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return qualities;
    }

    public List<Weapon> loadWeapons(){
        List<Weapon> weapons = new ArrayList<>();
        try {
            HashMap<String,Object> myMap = XMLLoadingHandler.parseFile(xmlWeaponFile);
            //überspringe äußere listen
            while(myMap.keySet().size() ==  1)
                myMap = (HashMap<String,Object>) myMap.get(myMap.keySet().toArray()[0]);
            if (!myMap.keySet().contains("weapon")){
                throw new ValueException("key 'weapon' not found");
            }
            for (String key : myMap.keySet()) {

                if (key.startsWith("weapon")) {
                    //parse the <skill> inside of <skills>
                    HashMap<String, Object> attributeMap = (HashMap<String, Object>) myMap.get(key);
                    Weapon currentWeapon;
                    boolean hasValue[] = new boolean[8];
                    String val;
                    boolean isMeele = false;
                    String strRange = (String) attributeMap.get("range");
                    if (strRange.equals("Meele")){
                        currentWeapon = new MeeleWeapon();
                        isMeele = true;
                    } else if (strRange.equals("Range")) {
                        currentWeapon = new DistanceWeapon();
                    }
                    else {
                        throw new ValueException("type not specified");
                    }
                    for (String skillKey : attributeMap.keySet()) {
                        switch (skillKey) {
                            case "id":
                                currentWeapon.setId((String) attributeMap.get(skillKey));
                                hasValue[0] = true;
                                break;
                            case "name":
                                currentWeapon.setName((String) attributeMap.get(skillKey));
                                hasValue[1] = true;
                            case "type":
                                currentWeapon.setType((String) attributeMap.get(skillKey));
                                hasValue[2] = true;
                                break;
                            case "cost":
                                val = (String) attributeMap.get(skillKey);
                                currentWeapon.setCost(Integer.parseInt(val));
                                hasValue[3] = true;
                                break;
                            case "availability":
                                int avail[] = parseAvailability((String) attributeMap.get(skillKey));
                                currentWeapon.setAvailability(avail[0]);
                                currentWeapon.setClassificationByInt(avail[1]);
                                hasValue[4] = true;
                                break;
                            case "range":
                                currentWeapon.setRange((String) attributeMap.get(skillKey));
                                hasValue[5] = true;
                                break;
                            case "damage":
                                currentWeapon.setDamage((String) attributeMap.get(skillKey));
                                hasValue[6] = true;
                                break;
                            case "ap":
                                val = (String) attributeMap.get(skillKey);
                                try {
                                    currentWeapon.setAp(Integer.parseInt(val));
                                }
                                catch (NumberFormatException e){
                                    currentWeapon.setAp(val);
                                }
                                hasValue[7] = true;
                            case "skill":
                                // todo
                            case "source":
                                //currentSkill.setSource((String)attributeMap.get(key));
                                break;
                            case "page":
                                //currentSkill.setPage((String)attributeMap.get(key));
                                break;
                        }
                    }

                    // weapon should have the values:
                    //
                    for (boolean bool : hasValue) {
                        if (!bool) throw new ValueException("Missing key in skills");
                    }
                    if(isMeele){
                        MeeleWeapon currentW = (MeeleWeapon) currentWeapon;
                        currentW.setAttribute(UsedAttribute.getAttributeByStr((String) attributeMap.get("attribute")));
                        currentW.setReach(Integer.parseInt((String)attributeMap.get("reach")));
                    }
                    else{
                        DistanceWeapon currentW = (DistanceWeapon) currentWeapon;
                        currentW.setMode((String)attributeMap.get("mode"));
                        val = (String)attributeMap.get("rc");
                        if(val != null)
                            currentW.setRc(Integer.parseInt(val));
                        val = (String)attributeMap.get("ammo");
                        if(val != null)
                            currentW.setAmmo(val);
                    }
                    weapons.add(currentWeapon);
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return weapons;
    }

    private int[] parseAvailability(String availability) {
        int ret[] = new int[2];
        int charindex = -1;
        // n = normal, r = restricted, F = forbidden/illegal
        for (char c : "NRF".toCharArray() ) {
            if(availability.indexOf(c) > charindex) {
                charindex = availability.indexOf(c);
                switch (c) {
                    case 'N':
                        ret[1] = 0;
                        break;
                    case 'R':
                        ret[1] = 1;
                        break;
                    case 'F':
                        ret[1] = 2;
                        break;
                }
            }
        }
        if(charindex == -1){
            throw new ValueException("Classificator(N/R/F) not specified");
        }

        ret[0] = Integer.parseInt(availability.substring(0,charindex));
        return ret;
    }
}
