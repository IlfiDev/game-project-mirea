package com.ilfidev.Classes;

public abstract class Entity {
    protected int healthPoints;
    protected static int id;
    protected int actionPoints;
    protected String name;


    public Entity(String name, int hp, int ap){
        this.name = name;
        healthPoints = hp;
        actionPoints = ap;
    }
    public int getHealthPoints(){
        return healthPoints;
    }
    public String getName(){
        return name;
    }
}
