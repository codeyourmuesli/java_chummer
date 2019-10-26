package com.shadow.model;

import java.util.Collection;
import com.shadow.model.Gear.Gear;

public class Character {

	private Description description;

	private int KarmaCurrent;

	private int KarmaTotal;

	private int Prominence;


	private int carryingCapacity;


	private Attributes attributes;

	private Collection<Quality> quality;

	private Collection<Skill> skill;

	private Collection<SkillGroup> skillGroup;

	private Collection<Gear> gear;

	private boolean isTechnomancer;

	private boolean isMage;

    public Character(Description description, int karmaCurrent, int karmaTotal, int prominence, int carryingCapacity, Attributes attributes, Collection<Quality> quality, Collection<Skill> skill, Collection<SkillGroup> skillGroup, Collection<Gear> gear) {
        this.description = description;
        KarmaCurrent = karmaCurrent;
        KarmaTotal = karmaTotal;
        Prominence = prominence;
        this.carryingCapacity = carryingCapacity;
        this.attributes = attributes;
        this.quality = quality;
        this.skill = skill;
        this.skillGroup = skillGroup;
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Character{" + "\n" +
                "description=" + description + "\n" +
                ", KarmaCurrent=" + KarmaCurrent +
                ", KarmaTotal=" + KarmaTotal +
                ", Prominence=" + Prominence +
                ", carryingCapacity=" + carryingCapacity + "\n" +
                ", attributes=" + attributes + "\n" +
                ", quality=" + quality +
                ", skill=" + skill +
                ", skillGroup=" + skillGroup +
                ", gear=" + gear +
                '}';
    }
}
