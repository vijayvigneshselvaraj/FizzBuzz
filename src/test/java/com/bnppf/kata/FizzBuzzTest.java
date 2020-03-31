package com.bnppf.kata;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class FizzBuzzTest {
    private static FizzBuzz fizzBuzz = null;
    private static ArrayList<String> result;

    @BeforeClass
    public static void setUp() {
        fizzBuzz = new FizzBuzz(1, 100);
        result = fizzBuzz.sayNumbers();
    }

    @Test
    public void fizzBuzzObjectNotNullCheck() {
        Assert.assertNotNull(fizzBuzz);
    }

    @Test
    public void fizzTest() {
        Assert.assertEquals("Fizz", result.get(2));
    }

    @Test
    public void bizzTest() {
        Assert.assertEquals("Buzz", result.get(4));
    }

    @Test
    public void fizzBizzTest() {
        Assert.assertEquals("FizzBuzz", result.get(14));
    }
}
