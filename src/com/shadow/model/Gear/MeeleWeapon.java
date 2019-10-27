package com.shadow.model.Gear;

import com.shadow.model.Skill;
import com.shadow.model.SkillName;
import com.shadow.model.UsedAttribute;

public class MeeleWeapon extends Weapon {

	private UsedAttribute attribute;

    protected int reach;

    public MeeleWeapon() {
        super();
    }

    public MeeleWeapon(String id, String name, int cost, int availability, Classification classification, String type, String range, String damage, int ap, SkillName usedSkill, UsedAttribute attribute, int reach) {
        super(id, name, cost, availability, classification, type, range, damage, ap, usedSkill);
        this.attribute = attribute;
        this.reach = reach;
    }

    public UsedAttribute getAttribute() {
        return attribute;
    }

    public void setAttribute(UsedAttribute attribute) {
        this.attribute = attribute;
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    @Override
    public String toString() {
        return "MeeleWeapon{\n" +
                "attribute=" + attribute +
                ", reach=" + reach +
                ", type='" + type + '\'' +
                ", range='" + range + '\'' +
                ", damage='" + damage + '\'' +
                ", ap=" + ap +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", availability=" + availability +
                ", classification=" + classification +
                "\n}";
    }
}
