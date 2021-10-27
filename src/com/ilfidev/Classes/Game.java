package com.ilfidev.Classes;

import java.util.Random;

public class Game {
    Player ent1;
    Monster ent2;

    public Game(Player pl){
        ent1 = pl;
        ent2 = new Monster("Spider", 50);
    }
    public void startGame(){
        while(ent1.getHealthPoints() > 0 && ent2.getHealthPoints() > 0){

            ent2.meleeAttack(ent1);
            System.out.println(ent2.getName() + " Attacks!");
            System.out.println(ent1.getName() + " health:" + ent1.getHealthPoints() + " | " + ent2.getName() + " health:" + ent2.getHealthPoints());
            Random rand = new Random();
            switch (rand.nextInt(2)){
                case 0:
                    System.out.println(ent1.getName() + " Melee Attacks!");
                    ent1.meleeAttack(ent2);
                    break;
                case 1:
                    System.out.println(ent1.getName() + " Magic Attacks!");
                    ent1.magicAttack(ent2);
                    break;
            }
            System.out.println(ent1.getName() + " health:" + ent1.getHealthPoints() + " | " + ent2.getName() + " health:" + ent2.getHealthPoints());
        }
    }
}
