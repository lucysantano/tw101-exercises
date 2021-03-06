package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(7);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int i,j,k;
        for(i=0; i<n; i++){
            for(j=0; j<n-1-i; j++) {
                System.out.print(" ");
            }
            for(k=0; k<n-j+i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        int i,j,k;
        for(i=0; i<n; i++){
            for(j=0; j<n-1-i; j++) {
                System.out.print(" ");
            }
            for(k=0; k<n-j+i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=n-1; i>0; i--){
            for(j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            for(k=0; k<n-j+i-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int i,j,k;
        for(i=0; i<n-1; i++){
            for(j=0; j<n-1-i; j++) {
                System.out.print(" ");
            }
            for(k=0; k<n-j+i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Lucy");
        for(i=n-1; i>0; i--){
            for(j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            for(k=0; k<n-j+i-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
