package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SummerTest {


    @Test
    @DisplayName("Given an array of integers a method should return the sum 57")
    public void sumArrayMethodTest_ShouldReturn57() {
        int[] theInts = {10, 15, 25, 7};
        int expected = 57;
        Summer summer = new Summer();
        int result = summer.sumArray(theInts);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given an empty array of integers a method should return the zero")
    public void sumArrayMethodTestForEmptyArray_ShouldReturn0() {
        int[] theInts = {};
        int expected = 0;
        Summer summer = new Summer();
        int result = summer.sumArray(theInts);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given an array of integers a method should return the -150")
    public void sumArrayMethodTest_ShouldReturnMinus150() {
        int[] theInts = {-10, -25, 15, -130};
        int expected = -150;
        Summer summer = new Summer();
        int result = summer.sumArray(theInts);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given an empty array of integers a method should return the zero")
    public void sumArrayMethodTest_ShouldReturnZero() {
        int[] theInts = {0,0,0,0,0};
        int expected = 0;
        Summer summer = new Summer();
        int result = summer.sumArray(theInts);
        Assertions.assertEquals(expected, result);
    }
}