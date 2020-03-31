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
}
