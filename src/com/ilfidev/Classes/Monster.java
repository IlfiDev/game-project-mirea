package com.ilfidev.Classes;

public class Monster extends Mob implements MeleeAttackable, Targetable {

    private float physicalResistance = 0.75F;
    private float magicResistance = 1;


    public Monster(String name, int hp, int ap) {
        super(name, hp, ap);
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
    public void heal(int amountOfHealt) {

    }

    @Override
    public void meleeAttack(Targetable target) {
        target.takeMeleeDamage(10);
    }

    @Override
    public void doCriticalDamage(int attackDmg) {

    }
}
