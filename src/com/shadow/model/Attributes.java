package com.shadow.model;

import java.util.ArrayList;
import java.util.List;

public class Attributes {

	private Attribute body;

	private Attribute agility;

	private Attribute reaction;

	private Attribute strength;

	private Attribute charisma;

	private Attribute intuition;

	private Attribute logic;

	private Attribute willpower;

	private Attribute edgeTotal;

	private int edgeCurrent;

	private Attribute essence;

	private Attribute init;

	private Attribute initPasses;

	private Attribute bp;

	private Attribute resonance;

	private Attribute magic;

	public Attribute getBody() {
		return body;
	}

	public void setBody(Attribute body) {
		this.body = body;
	}

	public Attribute getAgility() {
		return agility;
	}

	public void setAgility(Attribute agility) {
		this.agility = agility;
	}

	public Attribute getReaction() {
		return reaction;
	}

	public void setReaction(Attribute reaction) {
		this.reaction = reaction;
	}

	public Attribute getStrength() {
		return strength;
	}

	public void setStrength(Attribute strength) {
		this.strength = strength;
	}

	public Attribute getCharisma() {
		return charisma;
	}

	public void setCharisma(Attribute charisma) {
		this.charisma = charisma;
	}

	public Attribute getIntuition() {
		return intuition;
	}

	public void setIntuition(Attribute intuition) {
		this.intuition = intuition;
	}

	public Attribute getLogic() {
		return logic;
	}

	public void setLogic(Attribute logic) {
		this.logic = logic;
	}

	public Attribute getWillpower() {
		return willpower;
	}

	public void setWillpower(Attribute willpower) {
		this.willpower = willpower;
	}

	public Attribute getEdgeTotal() {
		return edgeTotal;
	}

	public void setEdgeTotal(Attribute edgeTotal) {
		this.edgeTotal = edgeTotal;
	}

	public int getEdgeCurrent() {
		return edgeCurrent;
	}

	public void setEdgeCurrent(int edgeCurrent) {
		this.edgeCurrent = edgeCurrent;
	}

	public Attribute getEssence() {
		return essence;
	}

	public void setEssence(Attribute essence) {
		this.essence = essence;
	}

	public Attribute getInit() {
		return init;
	}

	public void setInit(Attribute init) {
		this.init = init;
	}

	public Attribute getInitPasses() {
		return initPasses;
	}

	public void setInitPasses(Attribute initPasses) {
		this.initPasses = initPasses;
	}

	public Attribute getBp() {
		return bp;
	}

	public void setBp(Attribute bp) {
		this.bp = bp;
	}

	public Attribute getResonance() {
		return resonance;
	}

	public void setResonance(Attribute resonance) {
		this.resonance = resonance;
	}

	public Attribute getMagic() {
		return magic;
	}

	public void setMagic(Attribute magic) {
		this.magic = magic;
	}

	public void addAttribute(Attribute currentAttr) {
		switch (currentAttr.getName()){
			case "BOD":
				body = currentAttr;
				break;
			case "AGI":
				agility = currentAttr;
				break;
			case "REA":
				reaction = currentAttr;
				break;
			case "STR":
				strength = currentAttr;
				break;
			case "CHA":
				charisma = currentAttr;
				break;
			case "INT":
				intuition = currentAttr;
				break;
			case "LOG":
				logic = currentAttr;
				break;
			case "WIL":
				willpower = currentAttr;
				break;
			case "INI":
				init = currentAttr;
				break;
			case "EDG":
				edgeTotal = currentAttr;
				break;
			case "MAG":
				magic = currentAttr;
				break;
			case "RES":
				resonance = currentAttr;
				break;
			case "ESS":
				essence = currentAttr;
				break;

		}
	}

	public Attribute getAttributeByEnum(UsedAttribute usedAttribute){
        switch (usedAttribute){
            case BODY:
                return body;
            case AGILITY:
                return agility;
            case REACTION:
                return reaction;
            case STRENGTH:
                return  strength;
            case CHARISMA:
                return charisma;
            case INTUITUTION:
                return intuition;
            case LOGIC:
                return logic;
            case WILLPOWER:
                return willpower;
            case INITIATIVE:
                return init;
            case EDGE:
                return edgeTotal;
            case MAGIC:
                return magic;
            case RESONANCE:
                return resonance;
            case ESSENCE:
                return essence;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "body=" + body + '\n' +
                ", agility=" + agility + '\n' +
                ", reaction=" + reaction +'\n' +
                ", strength=" + strength +'\n' +
                ", charisma=" + charisma +'\n' +
                ", intuition=" + intuition +'\n' +
                ", logic=" + logic +'\n' +
                ", willpower=" + willpower +'\n' +
                ", edgeTotal=" + edgeTotal +'\n' +
                ", edgeCurrent=" + edgeCurrent +'\n' +
                ", essence=" + essence +'\n' +
                ", init=" + init +'\n' +
                ", initPasses=" + initPasses +'\n' +
                ", bp=" + bp +'\n' +
                ", resonance=" + resonance +'\n' +
                ", magic=" + magic +
                '}';
    }

	public List<Attribute> toList() {
		List<Attribute> attributes = new ArrayList<>();
		attributes.add(body);
		attributes.add(agility);
		attributes.add(reaction);
		attributes.add(strength);
		attributes.add(charisma);
		attributes.add(intuition);
		attributes.add(logic);
		attributes.add(willpower);
		attributes.add(edgeTotal);
		attributes.add(magic);
		attributes.add(resonance);
		return attributes;

	}
}
