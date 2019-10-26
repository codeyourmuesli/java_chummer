package com.shadow.model;

import com.shadow.model.Gear.Gear;

import java.util.Collection;

public class Technomancer extends Character {

	private int Resonance;


	public Technomancer(Description description, int karmaCurrent, int karmaTotal, int prominence, int carryingCapacity, Attributes attributes, Collection<Quality> quality, Collection<Skill> skill, Collection<SkillGroup> skillGroup, Collection<Gear> gear) {
		super(description, karmaCurrent, karmaTotal, prominence, carryingCapacity, attributes, quality, skill, skillGroup, gear);
	}
}
