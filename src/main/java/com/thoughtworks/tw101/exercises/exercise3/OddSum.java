package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    private int sum;
    public int of(int start, int end) {
        sum = 0;
        for(int i=start; i<=end; i++){
            if(i%2!=0){
                sum+=i;
            }
        }

        return sum;
    }
}
