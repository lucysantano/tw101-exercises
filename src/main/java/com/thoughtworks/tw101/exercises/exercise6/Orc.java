package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by lucysantano on 15-09-10.
 */
public class Orc implements Monster {
    private String name = "Orc";
    private final int intitialHitPoints = 20;
    private int currentHitPoints = intitialHitPoints;

    public void takeDamage(int amount) {
        currentHitPoints-=amount;
    }

    public void reportStatus() {
        System.out.println("Name: "+name+"\n"+"Current Hitpoints: "+currentHitPoints);
    }
}
