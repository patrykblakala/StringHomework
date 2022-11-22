package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountWordsTest {

//    tests for a method with input parameters: String[], char
    @Test
    @DisplayName("Given a String array words and char t should return 2")
    public void countWordsCharTest_Returns_2() {
    String[] words = {"The", "cat", "in","the","hat"};
    char character = 't';
    int expected = 2;
    int result = CountWords.countWords(words, character);
    assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String array words and char C should return 1")
    public void countWordsCharTest_ShouldReturn_1() {
        String[] words = {"The", "cat", "in","the","hat"};
        char character = 'C';
        int expected = 1;
        int result = CountWords.countWords(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String array words and char a should return 5")
    public void countWordsCharTest_ShouldReturn_5() {
        String[] words = {"AA", "aaa", "aAyter","Aaa","AaAct"};
        char character = 'a';
        int expected = 5;
        int result = CountWords.countWords(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String array words and char a should return 0")
    public void countWordsCharTest_ShouldReturn_0() {
        String[] words = {"bAA", "Caaa", "BCaAyter","MMAaa","TYAaAct"};
        char character = 'a';
        int expected = 0;
        int result = CountWords.countWords(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given an empty String array words and char a should return 0")
    public void countWordsCharTest_ShouldReturn_0_WithEmptyArray() {
        String[] words = {};
        char character = 'a';
        int expected = 0;
        int result = CountWords.countWords(words, character);
        assertEquals(expected, result);
    }

    //    tests for a method with input parameters: String[], Character

    @Test
    @DisplayName("Given a String array words and char t should return 2")
    public void countWordsCharacterTest_Returns_2() {
        String[] words = {"The", "cat", "in","the","hat"};
        char character = 't';
        int expected = 2;
        int result = CountWords.countWords(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String array words and char C should return 1")
    public void countWordsCharacterTest_ShouldReturn_1() {
        String[] words = {"The", "cat", "in","the","hat"};
        char character = 'C';
        int expected = 1;
        int result = CountWords.countWords(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String array words and char a should return 5")
    public void countWordsCharacterTest_ShouldReturn_5() {
        String[] words = {"AA", "aaa", "aAyter","Aaa","AaAct"};
        char character = 'a';
        int expected = 5;
        int result = CountWords.countWords(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String array words and char a should return 0")
    public void countWordsCharacterTest_ShouldReturn_0() {
        String[] words = {"bAA", "Caaa", "BCaAyter","MMAaa","TYAaAct"};
        char character = 'a';
        int expected = 0;
        int result = CountWords.countWords(words, character);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given an empty String array words and char a should return 0")
    public void countWordsCharacterTest_ShouldReturn_0_WithEmptyArray() {
        String[] words = {};
        char character = 'a';
        int expected = 0;
        int result = CountWords.countWords(words, character);
        assertEquals(expected, result);
    }
}