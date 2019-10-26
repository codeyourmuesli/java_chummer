package com.shadow.model;

public class Attribute {

    private String name;
    private int metatypemin;
    private int metatypemax;
    private int metatypeaugmax;
    private int value;
    private int augmodifier;
    private int totalvalue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMetatypemin() {
        return metatypemin;
    }

    public void setMetatypemin(int metatypemin) {
        this.metatypemin = metatypemin;
    }

    public int getMetatypemax() {
        return metatypemax;
    }

    public void setMetatypemax(int metatypemax) {
        this.metatypemax = metatypemax;
    }

    public int getMetatypeaugmax() {
        return metatypeaugmax;
    }

    public void setMetatypeaugmax(int metatypeaugmax) {
        this.metatypeaugmax = metatypeaugmax;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getAugmodifier() {
        return augmodifier;
    }

    public void setAugmodifier(int augmodifier) {
        this.augmodifier = augmodifier;
    }

    public int getTotalvalue() {
        return totalvalue;
    }

    public void setTotalvalue(int totalvalue) {
        this.totalvalue = totalvalue;
    }

    public static UsedAttribute getUsedAttributeByString(String name){
        switch (name){
            case "BOD":
                return UsedAttribute.BODY;

            case "AGI":
               return UsedAttribute.AGILITY;

            case "REA":
               return UsedAttribute.REACTION;

            case "STR":
               return UsedAttribute.STRENGTH;

            case "CHA":
               return UsedAttribute.CHARISMA;

            case "INT":
               return UsedAttribute.INTUITUTION;

            case "LOG":
               return UsedAttribute.LOGIC;

            case "WIL":
               return UsedAttribute.WILLPOWER;

            case "INI":
               return UsedAttribute.INITIATIVE;

            case "EDG":
               return UsedAttribute.EDGE;

            case "MAG":
               return UsedAttribute.MAGIC;

            case "RES":
               return UsedAttribute.RESONANCE;

            case "ESS":
               return UsedAttribute.ESSENCE;

            default:
               return UsedAttribute.NOT_SET;

        }
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "name='" + name + '\'' +
                ", metatypemin=" + metatypemin +
                ", metatypemax=" + metatypemax +
                ", metatypeaugmax=" + metatypeaugmax +
                ", value=" + value +
                ", augmodifier=" + augmodifier +
                ", totalvalue=" + totalvalue +
                '}';
    }
}
