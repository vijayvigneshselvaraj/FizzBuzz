package com.bnppf.kata;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class FizzBuzzTest {
    private static FizzBuzz fizzBuzz = null;
    private static ArrayList<String> numbers;

    @BeforeClass
    public static void setUp() {
        fizzBuzz = new FizzBuzz(1, 100);
        numbers = fizzBuzz.findNumbers();
    }

    @Test
    public void checkFizzBuzzWhetherObjectIsNotNullOrNotTest() {
        Assert.assertNotNull(fizzBuzz);
    }

    @Test
    public void checkNumberTwoIsFizzTest() {
        Assert.assertEquals("Fizz", numbers.get(2));
    }

    @Test
    public void checkNumberFourIsBuzzTest() {
        Assert.assertEquals("Buzz", numbers.get(4));
    }

    @Test
    public void checkNumberFourteenIsFizzBuzzTest() {
        Assert.assertEquals("FizzBuzz", numbers.get(14));
    }

    @Test
    public void checkNumberFifteenIsSixteenTest() {
        Assert.assertEquals("16", numbers.get(15));
    }

    @Test
    public void checkNumberTwelveIsFizzTest() {
        Assert.assertNotEquals("Fizz", numbers.get(12));
    }

    @Test
    public void checkNumberSevenIsBuzz() {
        Assert.assertNotEquals("Buzz", numbers.get(7));
    }

    @Test
    public void checkNumberFiveIsBuzz() {
        Assert.assertNotEquals("Buzz", numbers.get(5));
    }
}
