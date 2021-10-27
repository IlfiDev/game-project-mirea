package com.ilfidev.Classes;

public abstract class Entity {
    protected int healthPoints;
    protected static int id;
    protected String name;


    public Entity(String name, int hp){
        this.name = name;
        healthPoints = hp;
    }
    public int getHealthPoints(){
        return healthPoints;
    }
    public String getName(){
        return name;
    }
}
