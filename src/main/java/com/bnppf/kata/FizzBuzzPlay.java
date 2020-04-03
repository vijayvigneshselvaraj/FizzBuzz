package com.bnppf.kata;

import java.util.ArrayList;

public class FizzBuzzPlay {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(1, 100);
        ArrayList<String> numbers = fizzBuzz.findNumbers();
        System.out.println(numbers);
    }
}
