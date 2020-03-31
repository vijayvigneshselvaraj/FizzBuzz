package com.bnppf.kata;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {
    private static FizzBuzz fizzBuzz = null;

    @BeforeClass
    public static void setUp() {
        fizzBuzz = new FizzBuzz(1, 100);
    }

    @Test
    public void fizzBuzzObjectNotNullCheck() {
        Assert.assertNotNull(fizzBuzz);
    }

    @Test
    public void fizzTest() {
        Assert.assertEquals("Fizz", fizzBuzz.sayNumbers().get(2));
    }

    @Test
    public void bizzTest() {
        Assert.assertEquals("Buzz", fizzBuzz.sayNumbers().get(4));
    }

    @Test
    public void fizzBizzTest() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.sayNumbers().get(14));
    }
}
