package com.ilfidev.Classes;

public class Player extends Mob implements MeleeAttackable, MagicAttackable, Targetable{
    private int lvl;
    private float physicalResistance = 0.5F;
    private float magicResistance = 1;
    public Player(String name,int lvl, int hp){
        super(name, hp);
        this.lvl = lvl;


    }

    @Override
    public void takeMeleeDamage(int amountOfDamage) {
        healthPoints -= amountOfDamage * physicalResistance;
    }

    @Override
    public void takeMagicDamage(int amountOfDamage) {
        healthPoints -= amountOfDamage * magicResistance;
    }

    @Override
    public void putOnEffect(Effectable effect) {

    }

    @Override
    public void magicAttack(Targetable target) {
        target.takeMagicDamage(15);
    }

    @Override
    public void meleeAttack(Targetable target) {
       target.takeMeleeDamage(10);
    }

    @Override
    public void doCriticaldamage(int attackDmg) {

    }
}
