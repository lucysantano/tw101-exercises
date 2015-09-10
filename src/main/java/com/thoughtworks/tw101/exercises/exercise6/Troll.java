package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by lucysantano on 15-09-10.
 */
public class Troll implements Monster {
    private String name = "Troll";
    private final int intitialHitPoints = 40;
    private int currentHitPoints = intitialHitPoints;

    public void takeDamage(int amount) {
        currentHitPoints-=(amount/2);
    }

    public void reportStatus() {
        System.out.println("Name: "+name+"\n"+"Current Hitpoints: "+currentHitPoints);
    }
}
