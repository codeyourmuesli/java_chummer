package com.shadow.model;

public enum UsedAttribute {
    AGILITY,

    BODY,

    CHARISMA,

    EDGE,

    INTUITUTION,

    LOGIC,

    MAGIC,

    REACTION,

    RESONANCE,

    STRENGTH,

    INITIATIVE,

    WILLPOWER, ESSENCE,
    NOT_SET;

    public static UsedAttribute getAttributeByStr(String str){
        switch (str){
            case "BOD":
                return BODY;

            case "AGI":
                return AGILITY;

            case "REA":
                return REACTION;

            case "STR":
                return STRENGTH;

            case "CHA":
                return CHARISMA;

            case "INT":
                return INTUITUTION;

            case "LOG":
                return LOGIC;

            case "WIL":
                return WILLPOWER;

            case "INI":
                return INITIATIVE;

            case "EDG":
                return EDGE;

            case "MAG":
                return MAGIC;

            case "RES":
                return RESONANCE;

            case "ESS":
                return ESSENCE;

            default:
                return NOT_SET;
        }
    }
}
