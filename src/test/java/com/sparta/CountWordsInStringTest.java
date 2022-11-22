package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountWordsInStringTest {

    //    tests for a method with input parameters: String, char
    @Test
    @DisplayName("Given a String words and a character t should return 2")
    public void countWordsInStringMethodCharTest_ShouldReturn_2() {
        String words = "The cat in the hat";
        char character = 't';
        int expected = 2;
        int result = CountWordsInString.countWordsInString(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String words and char T should return 3")
    public void countWordsInStringMethodCharTest_ShouldReturn_3() {
        String words = "The cat in the hat just like that";
        char character = 'T';
        int expected = 3;
        int result = CountWordsInString.countWordsInString(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String words and char a should return 5")
    public void countWordsInStringMethodCharTest_ShouldReturn_5() {
        String words = "A Aaaa aAyter Aaa AaAct";
        char character = 'a';
        int expected = 5;
        int result = CountWordsInString.countWordsInString(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String words and char a should return 0")
    public void countWordsInStringMethodCharTest_ShouldReturn_0() {
        String words = "bA Caaa BCaAyter MMAaa TYAaAc";
        char character = 'a';
        int expected = 0;
        int result = CountWordsInString.countWordsInString(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given an empty String array words and char a should return 0")
    public void countWordsInStringMethodCharTest_ShouldReturn_0_WIthEmptyString() {
        String words = "";
        char character = 'a';
        int expected = 0;
        int result = CountWordsInString.countWordsInString(words, character);
        assertEquals(expected, result);
    }

    //    tests for a method with input parameters: String[], Character

    @Test
    @DisplayName("Given a String array words and char t should return 2")
    public void countWordsInStringMethodCharacterTest_ShouldReturn_2() {
        String words = "The cat in the hat";
        char character = 't';
        int expected = 2;
        int result = CountWordsInString.countWordsInString(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String words and char C should return 1")
    public void countWordsInStringMethodCharacterTest_ShouldReturn_1() {
        String words = "The cat in the hat";
        char character = 'C';
        int expected = 1;
        int result = CountWordsInString.countWordsInString(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String words and char a should return 5")
    public void countWordsInStringMethodCharacterTest_ShouldReturn_5() {
        String words = "AA  aa aaAyter Aaa AaAct";
        char character = 'a';
        int expected = 5;
        int result = CountWordsInString.countWordsInString(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String words and char a should return 0")
    public void countWordsInStringMethodCharacterTest_ShouldReturn_0() {
        String words = "bA gACaaa BCaAyter MMAaa TYAaAct";
        char character = 'a';
        int expected = 0;
        int result = CountWordsInString.countWordsInString(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given an empty String words and char a should return 0")
    public void countWordsInStringMethodCharacterTest_ShouldReturn_0_WithEmptyString() {
        String words = "";
        char character = 'a';
        int expected = 0;
        int result = CountWordsInString.countWordsInString(words, character);
        assertEquals(expected, result);
    }

}