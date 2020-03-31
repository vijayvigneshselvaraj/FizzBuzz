package com.bnppf.kata;

import java.util.ArrayList;

public class FizzBuzzPlay {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(1, 100);
        ArrayList<String> result = fizzBuzz.sayNumbers();
        System.out.println(result);
    }
}
