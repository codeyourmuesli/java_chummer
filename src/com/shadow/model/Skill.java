package com.shadow.model;

public class Skill {

	private String name;

	private String description;

	private SkillRestriction restricted;

	private SkillType type;

	private int rating;

	private int ratingmax;

	private String specialisation;

	private SkillGroupName group;

	private UsedAttribute attribute;

	private String skillgroup;

	private String skillcategory;

	private boolean grouped;

	private boolean isDefault;

	private boolean knowledge;

	private boolean isExotic;

	private String spec;

	private boolean allowdelete;

	private int totalvalue;

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

	public SkillRestriction getRestricted() {
		return restricted;
	}

	public void setRestricted(SkillRestriction restricted) {
		this.restricted = restricted;
	}

	public SkillType getType() {
		return type;
	}

	public void setType(SkillType type) {
		this.type = type;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRatingmax() {
		return ratingmax;
	}

	public void setRatingmax(int ratingmax) {
		this.ratingmax = ratingmax;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public SkillGroupName getGroup() {
		return group;
	}

	public void setGroup(SkillGroupName group) {
		this.group = group;
	}

	public UsedAttribute getAttribute() {
		return attribute;
	}

	public void setAttribute(UsedAttribute attribute) {
		this.attribute = attribute;
	}

	public void setAttribute(String attribute) {
		switch (attribute){
			case "BOD":
				this.attribute = UsedAttribute.BODY;
				break;
			case "AGI":
				this.attribute = UsedAttribute.AGILITY;
				break;
			case "REA":
				this.attribute = UsedAttribute.REACTION;
				break;
			case "STR":
				this.attribute = UsedAttribute.STRENGTH;
				break;
			case "CHA":
				this.attribute = UsedAttribute.CHARISMA;
				break;
			case "INT":
				this.attribute = UsedAttribute.INTUITUTION;
				break;
			case "LOG":
				this.attribute = UsedAttribute.LOGIC;
				break;
			case "WIL":
				this.attribute = UsedAttribute.WILLPOWER;
				break;
			case "INI":
				this.attribute = UsedAttribute.INITIATIVE;
				break;
			case "EDG":
				this.attribute = UsedAttribute.EDGE;
				break;
			case "MAG":
				this.attribute = UsedAttribute.MAGIC;
				break;
			case "RES":
				this.attribute = UsedAttribute.RESONANCE;
				break;
			case "ESS":
				this.attribute = UsedAttribute.ESSENCE;
				break;
			default:
				this.attribute = UsedAttribute.NOT_SET;
				break;
		}
	}

	public String getSkillgroup() {
		return skillgroup;
	}

	public void setSkillgroup(String skillgroup) {
		this.skillgroup = skillgroup;
	}

	public String getSkillcategory() {
		return skillcategory;
	}

	public void setSkillcategory(String skillcategory) {
		this.skillcategory = skillcategory;
	}

	public boolean isGrouped() {
		return grouped;
	}

	public void setGrouped(boolean grouped) {
		this.grouped = grouped;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean aDefault) {
		isDefault = aDefault;
	}

	public boolean isKnowledge() {
		return knowledge;
	}

	public void setKnowledge(boolean knowledge) {
		this.knowledge = knowledge;
	}

	public boolean isExotic() {
		return isExotic;
	}

	public void setExotic(boolean exotic) {
		isExotic = exotic;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public boolean isAllowdelete() {
		return allowdelete;
	}

	public void setAllowdelete(boolean allowdelete) {
		this.allowdelete = allowdelete;
	}

	public int getTotalvalue() {
		return totalvalue;
	}

	public void setTotalvalue(int totalvalue) {
		this.totalvalue = totalvalue;
	}

	@Override
	public String toString() {
		return "Skill{" + '\n' +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				", restricted=" + restricted +
				", type=" + type +
				", rating=" + rating +
				", ratingmax=" + ratingmax +
				", specialisation='" + specialisation + '\'' +
				", group=" + group +
				", attribute=" + attribute +
				", skillgroup='" + skillgroup + '\'' +
				", skillcategory='" + skillcategory + '\'' +
				", grouped=" + grouped +
				", isDefault=" + isDefault +
				", knowledge=" + knowledge +
				", isExotic=" + isExotic +
				", spec='" + spec + '\'' +
				", allowdelete=" + allowdelete +
				", totalvalue=" + totalvalue + '\n' +
				'}';
	}
}
