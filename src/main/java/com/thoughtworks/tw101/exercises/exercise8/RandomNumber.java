package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by lucysantano on 15-09-10.
 */
public class RandomNumber {
    private final int higherBound = 100;
    private final int lowerBound = 1;
    private int randNum;

    public RandomNumber(){
        randNum = (int)(Math.random()*(higherBound-lowerBound))+lowerBound;
    }

    public int getValue() {
        return randNum;
    }
}
