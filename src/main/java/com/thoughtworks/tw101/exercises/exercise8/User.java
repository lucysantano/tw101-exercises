package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lucysantano on 15-09-10.
 */
public class User {
    private int value;
    List<Integer> pastGuesses = new ArrayList<>();

    public void guess() throws NumberFormatException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Guess:");
        value = Integer.parseInt(scanner.nextLine());

    }

    public boolean checkGuess(int randNum) {
        pastGuesses.add(value);
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

    public void showPastGuesses() {
        System.out.println("Past Guesses:");
        for(Integer val: pastGuesses){
            System.out.print(val+" ");
        }
    }
}
