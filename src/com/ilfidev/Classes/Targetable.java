package com.ilfidev.Classes;

public interface Targetable {
    void takeMeleeDamage(int amountOfDamage);
    void takeMagicDamage(int amountOfDamage);
    void putOnEffect(Effectable effect);
    void heal(int amountOfHealt);
}
