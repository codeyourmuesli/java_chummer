package com.shadow.model.Gear;

public class Gear {

	protected String id;
	
	protected String name;

	protected int cost;

	protected int availability;

	protected int concealability;

	protected Classification classification;

	protected String group = "BandE/Drugs/whatever";

	protected License license;

    public Gear() {
    }

    public Gear(String id, String name, int cost, int availability, Classification classification) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.availability = availability;
        this.classification = classification;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public void setClassificationByInt(int i) {
        switch (i){
            case 0:
                this.classification = Classification.LEGAL;
                break;
            case 1:
                this.classification = Classification.RESTRICTED;
                break;
            case 2:
                this.classification = Classification.ILLEGAL;
                break;

        }
    }
}
