package com.shadow.model.Gear;

import com.shadow.model.Skill;
import com.shadow.model.SkillName;

import java.util.Collection;

public class DistanceWeapon extends Weapon {

	private String mode;

	private int rc;

	private String ammo;

	private Collection<Accessories> accessories;

	private Collection<AMMO> loadedAmmo;

	private Collection<ExplosiveAMMO> explosiveAmmo;

	public DistanceWeapon() {
		super();
	}

	public DistanceWeapon(String id, String name, int cost, int availability, Classification classification, String type, String range, String damage, int ap, SkillName usedSkill, String mode, int rc, String ammo) {
		super(id, name, cost, availability, classification, type, range, damage, ap, usedSkill);
		this.mode = mode;
		this.rc = rc;
		this.ammo = ammo;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getRc() {
		return rc;
	}

	public void setRc(int rc) {
		this.rc = rc;
	}

	public String getAmmo() {
		return ammo;
	}

	public void setAmmo(String ammo) {
		this.ammo = ammo;
	}

	@Override
	public String toString() {
		return "DistanceWeapon{\n" +
				"mode='" + mode + '\'' +
				", rc=" + rc +
				", ammo='" + ammo + '\'' +
				", type='" + type + '\'' +
				", range='" + range + '\'' +
				", damage='" + damage + '\'' +
				", ap=" + ap +
				", id='" + id + '\'' +
				", name='" + name + '\'' +
				", cost=" + cost +
				", availability=" + availability +
				"\n}";
	}
}
