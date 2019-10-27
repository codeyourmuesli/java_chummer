package com.shadow.model.Gear;

import com.shadow.model.Skill;
import com.shadow.model.SkillName;
import com.shadow.model.UsedAttribute;

public abstract class Weapon extends Gear {
    
    protected String type;
    
    protected String range; //evl unnötig
    
    protected String damage;
        
    protected int ap;

    private SkillName usedSkill;

    public Weapon() {
        super();
    }

    public Weapon(String id, String name, int cost, int availability, Classification classification, String type, String range, String damage, int ap, SkillName usedSkill) {
        super(id, name, cost, availability, classification);
        this.type = type;
        this.range = range;
        this.damage = damage;
        this.ap = ap;
        this.usedSkill = usedSkill;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public void setAp(String ap) {
        //todo
    }

    public SkillName getUsedSkill() {
        return usedSkill;
    }

    public void setUsedSkill(SkillName usedSkill) {
        this.usedSkill = usedSkill;
    }
}
