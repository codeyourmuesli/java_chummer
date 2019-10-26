package com.shadow.model;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class Quality {

	private Alignment alignment;

	private String id;
	private String name;

	private String description;

	private int bpCost;

	public Alignment getAignment() {
		return alignment;
	}

	public void setAlignment(Alignment aignment) {
		this.alignment = aignment;
	}

	public void setAlignment(String alignment) {
        switch (alignment) {
            case "Positive":
                this.alignment = Alignment.POSITIVE;
                break;
            case "Negative":
                this.alignment = Alignment.NEGATIVE;
                break;
            default:
                throw new ValueException("Alignment should be 'Positive' or 'Negative'");
        }
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBpCost() {
		return bpCost;
	}

	public void setBpCost(int bpCost) {
		this.bpCost = bpCost;
	}

    @Override
    public String toString() {
        return "Quality{" +
                "alignment=" + alignment +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", bpCost=" + bpCost +
                '}';
    }
}
