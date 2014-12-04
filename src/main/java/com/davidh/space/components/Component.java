package com.davidh.space.components;

/**
 *
 * @author david.hines
 */
public abstract class Component {
    protected int cost;
    protected int durability;
    protected int resistance;
    protected int energyCost;

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }
    
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
    
    
}
