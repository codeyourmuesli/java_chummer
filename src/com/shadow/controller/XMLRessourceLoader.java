package com.shadow.controller;

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

}
