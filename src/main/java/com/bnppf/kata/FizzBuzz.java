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

        return  numbers;
    }
}
