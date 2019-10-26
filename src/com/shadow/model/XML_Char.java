package com.shadow.model;

import com.shadow.model.Gear.Car;
import com.shadow.model.Gear.Gear;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.*;

public class XML_Char {

    public HashMap<String,Object> xml_Attributes = createMap();

    private String appversion;
    private String gameedition;
    private String settings;
    private String metatype;
	private String metatypebp;
	private String metavariant;
	private String metatypecategory;
	private String movement;
	private String mutantcritterbaseskills;
	private String essenceatspecialstart;
	private String name;
	private String mugshot;
	private String sex;
	private String age;
	private String eyes;
	private String height;
	private String weight;
	private String skin;
	private String hair;
	private String description;
	private String background ;
	private String concept;
	private String notes;
	private String alias;
	private String playername;
	private String gamenotes;
	private String karma;
	private String totalkarma;
	private String streetcred;
	private String notoriety;
	private String privateawareness;
	private String burntstreetcred;
	private String created;
	private String maxavail;
	private String nuyen;
	private String bp;
	private String buildkarma;
	private String buildmethod;
	private String knowpts;
	private String nuyenbp;
	private String nuyenmaxbp;
	private String adept;
	private String magician;
	private String technomancer;
	private String initiationoverride;
	private String critter;
	private String uneducated;
	private String uncouth;
	private String infirm;
	private String blackmarket;
	private Attributes attributes;
    private String magenabled;
	private String initiategrade;
	private String resenabled;
	private String submersiongrade;
	private String groupmember;
	private String groupname ;
	private String groupnotes ;
	private String totaless;
	private String tradition;
	private String stream;
	private String physicalcmfilled;
	private String stuncmfilled;
	private List<SkillGroup> skillgroups = new ArrayList<>();
	private List<Skill> skills;
	private List<Connection> contacts = new ArrayList<>();
    private List<Spell> spells = new ArrayList<>();
	private String foci;
	private String stackedfoci;
	private String powers;
	private String spirits;
	private String techprograms;
	private String martialarts;
	private String martialartmaneuvers;
	private String armors;
    private String weapons;
    private String cyberwares;
    private List<Quality> qualities;
    private String lifestyles;
    private List<Gear> gears = new ArrayList<>();
    private List<Car> vehicles = new ArrayList<>();;
    private String metamagics ;
	private String critterpowers ;
	private String initiationgrades;
	private String improvements;
    private String expenses;
    private String locations;
	private String armorbundles ;
	private String weaponlocations ;
	private String improvementgroups ;
	private String calendar ;

    /**
     * Create a map with all relevant keys
     * @return Hashmap
     */
    private static HashMap<String, Object> createMap() {
        HashMap<String,Object> myMap = new HashMap<>();
        myMap.put("appversion", "");
        myMap.put("gameedition", "");
        myMap.put("settings", "");
        myMap.put("metatype", "");
        myMap.put("metatypebp", "");
        myMap.put("metavariant", "");
        myMap.put("metatypecategory", "");
        myMap.put("movement", "");
        myMap.put("mutantcritterbaseskills", "");
        myMap.put("essenceatspecialstart", "");
        myMap.put("name", "");
        myMap.put("mugshot", "");
        myMap.put("sex", "");
        myMap.put("age", "");
        myMap.put("eyes", "");
        myMap.put("height", "");
        myMap.put("weight", "");
        myMap.put("skin", "");
        myMap.put("hair", "");
        myMap.put("description", "");
        myMap.put("background" , "");
        myMap.put("concept", "");
        myMap.put("notes", "");
        myMap.put("alias", "");
        myMap.put("playername", "");
        myMap.put("gamenotes", "");
        myMap.put("karma", "");
        myMap.put("totalkarma", "");
        myMap.put("streetcred", "");
        myMap.put("notoriety", "");
        myMap.put("publicawareness", "");
        myMap.put("burntstreetcred", "");
        myMap.put("created", "");
        myMap.put("maxavail", "");
        myMap.put("nuyen", "");
        myMap.put("bp", "");
        myMap.put("buildkarma", "");
        myMap.put("buildmethod", "");
        myMap.put("knowpts", "");
        myMap.put("nuyenbp", "");
        myMap.put("nuyenmaxbp", "");
        myMap.put("adept", "");
        myMap.put("magician", "");
        myMap.put("technomancer", "");
        myMap.put("initiationoverride", "");
        myMap.put("critter", "");
        myMap.put("uneducated", "");
        myMap.put("uncouth", "");
        myMap.put("infirm", "");
        myMap.put("blackmarket", "");
        myMap.put( "attributes", null);
        myMap.put("magenabled", "");
        myMap.put("initiategrade", "");
        myMap.put("resenabled", "");
        myMap.put("submersiongrade", "");
        myMap.put("groupmember", "");
        myMap.put("groupname", "");
        myMap.put("groupnotes", "");
        myMap.put("totaless", "");
        myMap.put("tradition", "");
        myMap.put("stream", "");
        myMap.put("physicalcmfilled", "");
        myMap.put("stuncmfilled", "");
        myMap.put("skillgroups", null);
        myMap.put("skills", null);
        myMap.put("contacts", null);
        myMap.put("spells", "");
        myMap.put("foci", "");
        myMap.put("stackedfoci", "");
        myMap.put("powers", "");
        myMap.put("spirits", "");
        myMap.put("techprograms", "");
        myMap.put("martialarts", "");
        myMap.put("martialartmaneuvers", "");
        myMap.put("armors", "");
        myMap.put("weapons", "");
        myMap.put("cyberwares", "");
        myMap.put("qualities", "");
        myMap.put("lifestyles", "");
        myMap.put("gears ", null);
        myMap.put("vehicles", null);
        myMap.put("metamagics", "");
        myMap.put("critterpowers", "");
        myMap.put("initiationgrades", "");
        myMap.put("improvements", "");
        myMap.put("expenses", "");
        myMap.put("locations", "");
        myMap.put("armorbundles ", "");
        myMap.put("weaponlocations ", "");
        myMap.put("improvementgroups ", "");
        myMap.put("calendar", "");
        return myMap;
    }


    public void setXMLAttributes( HashMap<String, Object> valueMap){
        if(valueMap.keySet().contains("character")){
            valueMap = (HashMap<String, Object>) valueMap.get("character");
        }
        for (String key : valueMap.keySet()) {
            switch (key) {
                case "":
                    break;

               case "appversion":
                   appversion = (String) valueMap.get(key);
                    break;
                 case "gameedition":
                     gameedition = (String) valueMap.get(key);
                    break;
                 case "settings":
                     settings = (String) valueMap.get(key);
                    break;
                 case "metatype":
                     metatype = (String) valueMap.get(key);
                    break;
                 case "metatypebp":
                     metatypebp = (String) valueMap.get(key);
                    break;
                 case "metavariant":
                     metavariant = (String) valueMap.get(key);
                    break;
                 case "metatypecategory":
                     metatypecategory = (String) valueMap.get(key);
                    break;
                 case "movement":
                     movement = (String) valueMap.get(key);
                    break;
                 case "mutantcritterbaseskills":
                     mutantcritterbaseskills = (String) valueMap.get(key);
                    break;
                 case "essenceatspecialstart":
                     essenceatspecialstart = (String) valueMap.get(key);
                    break;
                 case "name":
                     name = (String) valueMap.get(key);
                    break;
                 case "mugshot":
                     mugshot = (String) valueMap.get(key);
                    break;
                 case "sex":
                     sex = (String) valueMap.get(key);
                    break;
                 case "age":
                     age = (String) valueMap.get(key);
                    break;
                 case "eyes":
                     eyes = (String) valueMap.get(key);
                    break;
                 case "height":
                     height = (String) valueMap.get(key);
                    break;
                 case "weight":
                     weight = (String) valueMap.get(key);
                    break;
                 case "skin":
                     skin = (String) valueMap.get(key);
                    break;
                 case "hair":
                     hair = (String) valueMap.get(key);
                    break;
                 case "description":
                     description = (String) valueMap.get(key);
                    break;
                 case "background":
                     background = (String) valueMap.get(key);
                    break;
                 case "concept":
                     concept = (String) valueMap.get(key);
                    break;
                 case "notes":
                     notes = (String) valueMap.get(key);
                    break;
                 case "alias":
                     alias = (String) valueMap.get(key);
                    break;
                 case "playername":
                     playername = (String) valueMap.get(key);
                    break;
                 case "gamenotes":
                     gamenotes = (String) valueMap.get(key);
                    break;
                 case "karma":
                     karma = (String) valueMap.get(key);
                    break;
                 case "totalkarma":
                     totalkarma = (String) valueMap.get(key);
                    break;
                 case "streetcred":
                     streetcred = (String) valueMap.get(key);
                    break;
                 case "notoriety":
                     notoriety = (String) valueMap.get(key);
                    break;
                 case "privateawareness":
                     privateawareness = (String) valueMap.get(key);
                    break;
                 case "burntstreetcred":
                     burntstreetcred = (String) valueMap.get(key);
                    break;
                 case "created":
                     created = (String) valueMap.get(key);
                    break;
                 case "maxavail":
                     maxavail = (String) valueMap.get(key);
                    break;
                 case "nuyen":
                     nuyen = (String) valueMap.get(key);
                    break;
                 case "bp":
                     bp = (String) valueMap.get(key);
                    break;
                 case "buildkarma":
                     buildkarma = (String) valueMap.get(key);
                    break;
                 case "buildmethod":
                     buildmethod = (String) valueMap.get(key);
                    break;
                 case "knowpts":
                     knowpts = (String) valueMap.get(key);
                    break;
                 case "nuyenbp":
                    nuyenbp = (String) valueMap.get(key);
                    break;
                 case "nuyenmaxbp":
                     nuyenmaxbp = (String) valueMap.get(key);
                    break;
                 case "adept":
                     adept = (String) valueMap.get(key);
                    break;
                 case "magician":
                     magician = (String) valueMap.get(key);
                    break;
                 case "technomancer":
                     technomancer = (String) valueMap.get(key);
                    break;
                 case "initiationoverride":
                     initiationoverride = (String) valueMap.get(key);
                    break;
                 case "critter":
                     critter = (String) valueMap.get(key);
                    break;
                 case "uneducated":
                     uneducated = (String) valueMap.get(key);
                    break;
                 case "uncouth":
                     uncouth = (String) valueMap.get(key);
                    break;
                 case "infirm":
                     infirm = (String) valueMap.get(key);
                    break;
                 case "blackmarket":
                    blackmarket = (String) valueMap.get(key);
                    break;
                 case "attributes":
                   attributes = createAttributes((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "magenabled":
                     magenabled = (String) valueMap.get(key);
                    break;
                 case "initiategrade":
                     initiategrade = (String) valueMap.get(key);
                    break;
                 case "resenabled":
                     resenabled = (String) valueMap.get(key);
                    break;
                 case "submersiongrade":
                     submersiongrade = (String) valueMap.get(key);
                    break;
                 case "groupmember":
                     groupmember = (String) valueMap.get(key);
                    break;
                 case "groupname ":
                     groupname = (String) valueMap.get(key);
                    break;
                 case "groupnotes ":
                     groupnotes = (String) valueMap.get(key);
                    break;
                 case "totaless":
                     totaless = (String) valueMap.get(key);
                    break;
                 case "tradition":
                     tradition = (String) valueMap.get(key);
                    break;
                 case "stream":
                     stream = (String) valueMap.get(key);
                    break;
                 case "physicalcmfilled":
                     physicalcmfilled = (String) valueMap.get(key);
                    break;
                 case "stuncmfilled":
                     stuncmfilled = (String) valueMap.get(key);
                    break;
                 case "skillgroups":
                   createSkillGroups((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "skills":
                   skills = createSkills((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "contacts":
                   contacts = createConnections((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "spells":
                   spells = createSpells((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "foci":
                     createFoki((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "stackedfoci":
                     createStackedFoki((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "powers":
                     createPowers((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "spirits":
                     createSpirits((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "techprograms":
                     createTechnograms((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "martialarts":
                     createMartialarts((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "martialartmaneuvers":
                     createMartialartManeuvers((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "armors":
                     createArmors((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "weapons":
                     createWeapons((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "cyberwares":
                     createCyberwares((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "qualities":
                     qualities = createQualities((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "lifestyles":
                     createLifestyles((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "gears":
                   gears = createGears((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "vehicles":
                   vehicles = createCars((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "metamagics":
                     createMetamagics((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "critterpowers":
                     createCritterpowers((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "initiationgrades":
                     createInitiationgrades((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "improvements":
                     createImprovements((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "expenses":
                     createExpenses((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "locations":
                     createLocations((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "armorbundles":
                     createArmorBundles((HashMap<String, Object>) valueMap.get(key));
                    break;
                 case "weaponlocations":
                     createWeaponLocations((HashMap<String, Object>)valueMap.get(key));
                    break;
                 case "improvementgroups":
                     createImprovementGroups((HashMap<String, Object>)valueMap.get(key));
                    break;
                 case "calendar":
                     calendar = (String) valueMap.get(key);
                    break;
            }
        }
    }

    private Attributes createAttributes(HashMap<String, Object> valueMap) {
        if(valueMap.keySet().size() ==  1)
            valueMap = (HashMap<String,Object>) valueMap.get("attribute");
        Attributes attr = new Attributes();

        for (String key : valueMap.keySet()) {

            if (key.startsWith("attribute")) {
                //parse the <attribute> inside of <arrtibutes>
                HashMap<String,Object> attributeMap = (HashMap<String, Object>) valueMap.get(key);
                Attribute currentAttr = new Attribute();
                String val;
                for(String attrKey : attributeMap.keySet()) {
                    switch (attrKey) {
                        case "name":
                            currentAttr.setName((String) attributeMap.get(attrKey));
                            break;
                        case "metatypemin":
                            val = (String) attributeMap.get(attrKey);
                            currentAttr.setMetatypemin(Integer.parseInt(val));
                            break;
                        case "metatypemax":
                            val = (String) attributeMap.get(attrKey);
                            currentAttr.setMetatypemax(Integer.parseInt(val));
                            break;
                        case "metatypeaugmax":
                            val = (String) attributeMap.get(attrKey);
                            currentAttr.setMetatypeaugmax(Integer.parseInt(val));
                            break;
                        case "value":
                            val = (String) attributeMap.get(attrKey);
                            currentAttr.setValue(Integer.parseInt(val));
                            break;
                        case "augmodifier":
                            val = (String) attributeMap.get(attrKey);
                            currentAttr.setAugmodifier(Integer.parseInt(val));
                            break;
                        case "totalvalue":
                            val = (String) attributeMap.get(attrKey);
                            currentAttr.setTotalvalue(Integer.parseInt(val));
                            break;
                    }
                }
                attr.addAttribute(currentAttr);
            }
        }
        return attr;
    }

        private List<Skill> createSkills(HashMap<String, Object> valueMap) {
            if(valueMap.keySet().size() ==  1)
                valueMap = (HashMap<String,Object>) valueMap.get("skill");

            List<Skill> skills = new ArrayList<Skill>();
            for (String key : valueMap.keySet()) {

                if (key.startsWith("skill")) {
                    //parse the <skill> inside of <skills>
                    HashMap<String,Object> attributeMap = (HashMap<String, Object>) valueMap.get(key);
                    Skill currentSkill = new Skill();
                    String val;
                    for(String skillKey : attributeMap.keySet()) {
                        switch (skillKey) {
                            case "name":
                                currentSkill.setName((String) attributeMap.get(skillKey));
                                break;
                            case "skillgroup":
                                currentSkill.setSkillgroup((String)attributeMap.get(skillKey));
                                break;
                            case "skillcategory":
                                currentSkill.setSkillcategory((String)attributeMap.get(skillKey));
                                break;
                            case "grouped":
                                val = (String) attributeMap.get(skillKey);
                                currentSkill.setGrouped(Boolean.parseBoolean(val));
                                break;
                            case "default":
                                val = (String) attributeMap.get(skillKey);
                                currentSkill.setDefault(Boolean.parseBoolean(val));
                                break;
                            case "rating":
                                val = (String) attributeMap.get(skillKey);
                                currentSkill.setRating(Integer.parseInt(val));
                                break;
                            case "ratingmax":
                                val = (String) attributeMap.get(skillKey);
                                currentSkill.setRatingmax(Integer.parseInt(val));
                                break;
                            case "knowledge":
                                val = (String) attributeMap.get(skillKey);
                                currentSkill.setKnowledge(Boolean.parseBoolean(val));
                                break;
                            case "exotic":
                                val = (String) attributeMap.get(skillKey);
                                currentSkill.setExotic(Boolean.parseBoolean(val));
                                break;
                            case "spec":
                                currentSkill.setSpec((String)attributeMap.get(skillKey));
                                break;
                            case "allowdelete":
                                val = (String) attributeMap.get(skillKey);
                                currentSkill.setAllowdelete(Boolean.parseBoolean(val));
                                break;
                            case "attribute":
                                currentSkill.setAttribute((String)attributeMap.get(skillKey));
                                break;
                            case "source":
                                //currentSkill.setSource((String)attributeMap.get(key));
                                break;
                            case "page":
                                //currentSkill.setPage((String)attributeMap.get(key));
                                break;
                            case "totalvalue":
                                val = (String) attributeMap.get(skillKey);
                                currentSkill.setTotalvalue(Integer.parseInt(val));
                                break;
                        }
                    }
                    skills.add(currentSkill);
                }
            }
            return skills;
        }

        private List<SkillGroup> createSkillGroups(HashMap<String, Object> valueMap) {
            List<SkillGroup> skillGroups = new ArrayList<>();
            return skillGroups;
        }

        private List<Connection> createConnections(HashMap<String, Object> valueMap) {
            List<Connection> connections = new ArrayList<>();
            return connections;
        }

        private List<Spell> createSpells(HashMap<String, Object> valueMap) {
            List<Spell> spells = new ArrayList<>();
            return spells;
        }

        private void createFoki(HashMap<String, Object> valueMap) {

        }

        private void createStackedFoki(HashMap<String, Object> valueMap) {

        }

        private void createPowers(HashMap<String, Object> valueMap) {

        }

        private void createSpirits(HashMap<String, Object> valueMap) {

        }

        private void createTechnograms(HashMap<String, Object> valueMap) {

        }

        private void createMartialarts(HashMap<String, Object> valueMap) {

        }

        private void createMartialartManeuvers(HashMap<String, Object> valueMap) {

        }

        private void createArmors(HashMap<String, Object> valueMap) {

        }

        private void createWeapons(HashMap<String, Object> valueMap) {

        }

        private void createCyberwares(HashMap<String, Object> valueMap) {

        }

        private List<Quality> createQualities(HashMap<String, Object> valueMap) {
            List<Quality> qualities = new ArrayList<>();
            return qualities;
        }

        private void createLifestyles(HashMap<String, Object> valueMap) {

        }

        private List<Gear> createGears(HashMap<String, Object> valueMap) {
            List<Gear> gears = new ArrayList<>();
            return gears;
        }

        private List<Car> createCars(HashMap<String, Object> valueMap) {
            List<Car> cars = new ArrayList<>();
            return cars;
        }

        private void createMetamagics(HashMap<String, Object> valueMap) {

        }

        private void createCritterpowers(HashMap<String, Object> valueMap) {

        }

        private void createInitiationgrades(HashMap<String, Object> valueMap) {

        }

        private void createImprovements(HashMap<String, Object> valueMap) {

        }

        private void createExpenses(HashMap<String, Object> valueMap) {

        }

        private void createLocations(HashMap<String, Object> valueMap) {

        }

        private void createArmorBundles(HashMap<String, Object> valueMap) {

        }

        private void createWeaponLocations(HashMap<String, Object> valueMap) {

        }

        private void createImprovementGroups(HashMap<String, Object> valueMap) {

        }

        private Description createDescription(){
            // define Metatype
            Metatyp metatype = Metatyp.HUMAN;
            // define Lifestyle
            Lifestyle lifestyle = Lifestyle.STREET;
            int age = Integer.parseInt(this.age);
            int weight = Integer.parseInt(this.weight);
            double height = Double.parseDouble(this.height);
            return new Description(name, alias, metatype, eyes, lifestyle, age, sex, weight, height, hair, skin,
                    mugshot, description, background, notes);
        }

        public Character createChar(){
            Description description = createDescription();
            int karma = Integer.parseInt(this.karma);
            int totalKarma = Integer.parseInt(this.totalkarma);
            int notoriety = Integer.parseInt(this.notoriety);
            int carryingCapacyty = 0;
            return new Character( description, karma, totalKarma, notoriety, carryingCapacyty, attributes, qualities,
                    skills, skillgroups, gears);
        }


        public boolean containsXMLKey(String key){
            return xml_Attributes.containsKey(key);
        }

        @Override
        public String toString() {
            return "XML_Char{" +
                    "appversion='" + appversion + "\'\n" +
                    ", gameedition='" + gameedition + "\'\n" +
                    ", settings='" + settings + "\'\n" +
                    ", metatype='" + metatype + "\'\n" +
                    ", metatypebp='" + metatypebp + "\'\n" +
                    ", metavariant='" + metavariant + "\'\n" +
                    ", metatypecategory='" + metatypecategory + "\'\n" +
                    ", movement='" + movement + "\'\n" +
                    ", mutantcritterbaseskills='" + mutantcritterbaseskills + "\'\n" +
                    ", essenceatspecialstart='" + essenceatspecialstart + "\'\n" +
                    ", name='" + name + "\'\n" +
                    ", mugshot='" + mugshot + "\'\n" +
                    ", sex='" + sex + "\'\n" +
                    ", age='" + age + "\'\n" +
                    ", eyes='" + eyes + "\'\n" +
                    ", height='" + height + "\'\n" +
                    ", weight='" + weight + "\'\n" +
                    ", skin='" + skin + "\'\n" +
                    ", hair='" + hair + "\'\n" +
                    ", description='" + description + "\'\n" +
                    ", background='" + background + "\'\n" +
                    ", concept='" + concept + "\'\n" +
                    ", notes='" + notes + "\'\n" +
                    ", alias='" + alias + "\'\n" +
                    ", playername='" + playername + "\'\n" +
                    ", gamenotes='" + gamenotes + "\'\n" +
                    ", karma='" + karma + "\'\n" +
                    ", totalkarma='" + totalkarma + "\'\n" +
                    ", streetcred='" + streetcred + "\'\n" +
                    ", notoriety='" + notoriety + "\'\n" +
                    ", burntstreetcred='" + burntstreetcred + "\'\n" +
                    ", created='" + created + "\'\n" +
                    ", maxavail='" + maxavail + "\'\n" +
                    ", nuyen='" + nuyen + "\'\n" +
                    ", bp='" + bp + "\'\n" +
                    ", buildkarma='" + buildkarma + "\'\n" +
                    ", buildmethod='" + buildmethod + "\'\n" +
                    ", knowpts='" + knowpts + "\'\n" +
                    ", nuyenbp='" + nuyenbp + "\'\n" +
                    ", nuyenmaxbp='" + nuyenmaxbp + "\'\n" +
                    ", adept='" + adept + "\'\n" +
                    ", magician='" + magician + "\'\n" +
                    ", technomancer='" + technomancer + "\'\n" +
                    ", initiationoverride='" + initiationoverride + "\'\n" +
                    ", critter='" + critter + "\'\n" +
                    ", uneducated='" + uneducated + "\'\n" +
                    ", uncouth='" + uncouth + "\'\n" +
                    ", infirm='" + infirm + "\'\n" +
                    ", blackmarket='" + blackmarket + "\'\n" +
                    ", attributes='" + attributes + "\'\n" +
                    ", magenabled='" + magenabled + "\'\n" +
                    ", initiategrade='" + initiategrade + "\'\n" +
                    ", resenabled='" + resenabled + "\'\n" +
                    ", submersiongrade='" + submersiongrade + "\'\n" +
                    ", groupmember='" + groupmember + "\'\n" +
                    ", groupname='" + groupname + "\'\n" +
                    ", groupnotes='" + groupnotes + "\'\n" +
                    ", totaless='" + totaless + "\'\n" +
                    ", tradition='" + tradition + "\'\n" +
                    ", stream='" + stream + "\'\n" +
                    ", physicalcmfilled='" + physicalcmfilled + "\'\n" +
                    ", stuncmfilled='" + stuncmfilled + "\'\n" +
                    ", skillgroups=" + skillgroups +
                    ", skills=" + skills.toString() +
                    ", contacts=" + contacts.toString() +
                    ", spells='" + spells + "\'\n" +
                    ", foci='" + foci + "\'\n" +
                    ", stackedfoci='" + stackedfoci + "\'\n" +
                    ", powers='" + powers + "\'\n" +
                    ", spirits='" + spirits + "\'\n" +
                    ", techprograms='" + techprograms + "\'\n" +
                    ", martialarts='" + martialarts + "\'\n" +
                    ", martialartmaneuvers='" + martialartmaneuvers + "\'\n" +
                    ", armors='" + armors + "\'\n" +
                    ", weapons='" + weapons + "\'\n" +
                    ", cyberwares='" + cyberwares + "\'\n" +
                    ", qualities='" + qualities + "\'\n" +
                    ", lifestyles='" + lifestyles + "\'\n" +
                    ", gears=" + gears.toString() +
                    ", vehicles=" + vehicles.toString() +
                    ", metamagics='" + metamagics + "\'\n" +
                    ", critterpowers='" + critterpowers + "\'\n" +
                    ", initiationgrades='" + initiationgrades + "\'\n" +
                    ", improvements='" + improvements + "\'\n" +
                    ", expenses='" + expenses + "\'\n" +
                    ", locations='" + locations + "\'\n" +
                    ", armorbundles='" + armorbundles + "\'\n" +
                    ", weaponlocations='" + weaponlocations + "\'\n" +
                    ", improvementgroups='" + improvementgroups + "\'\n" +
                    ", calendar='" + calendar + "\'\n" +
                    '}';
    }
}