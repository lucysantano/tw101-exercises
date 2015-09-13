package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.


public class Main {
    public static void main(String[] args) {

        RandomNumber number = new RandomNumber();
        User user = new User();
        boolean correctGuess = false;
        while (!correctGuess) {
            try{
                user.guess();
                correctGuess = user.checkGuess(number.getValue());
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid information was entered! Please enter a number!");
            }
        }
        user.showPastGuesses();
    }
}
