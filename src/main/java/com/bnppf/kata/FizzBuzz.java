package com.bnppf.kata;

import java.util.ArrayList;

public class FizzBuzz {
    // List to hold the final numbers
    private ArrayList<String> numbers = null;

    // Numbers start and end range (Note: Start and End numbers are inclusive)
    private int fromNumber;
    private int toNumber;

    FizzBuzz(int fromNumber, int toNumber) {
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
    }

    public ArrayList<String> sayNumbers() {
        numbers = new ArrayList();
        for (int i=this.fromNumber; i<=this.toNumber; i++) {
            if (i%3==0 && i%5==0) numbers.add("FizzBuzz");
            else if(i%3==0) numbers.add("Fizz");
            else if(i%5==0) numbers.add("Buzz");
            else numbers.add(""+i);
        }
        return numbers;
    }
}
