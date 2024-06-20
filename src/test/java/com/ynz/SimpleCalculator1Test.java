package com.ynz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculator1Test {

    @Test
    void oneTwoThreeShouldSix()
    {
        var calculator = new SimpleCalculator1();
        assertEquals(60, calculator.add(1,2,3));
    }

}