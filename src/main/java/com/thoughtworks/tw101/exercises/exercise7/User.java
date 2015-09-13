package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by lucysantano on 15-09-10.
 */
public class User {
    private int value;

    public void guess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Guess:");
        value = scanner.nextInt();
    }

    public boolean checkGuess(int randNum) {
        if(value<randNum){
            System.out.println("Your guess is too low! Guess again!");
            return false;
        }
        else if(value>randNum){
            System.out.println("Your guess is too high! Guess again!");
            return false;
        }
        else{
            System.out.println("You guessed correctly!");
            return true;
        }

    }
}
