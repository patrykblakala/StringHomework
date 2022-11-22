package com.sparta;

public class CountWords {

    public static int countWords(String[] words, Character character) {
        int counter = 0;
        for (String word : words) {
            if (word.toLowerCase().startsWith(character.toString().toLowerCase())) {
                counter++;
            }
        }
        return counter;
    }
    public static int countWords(String[] words, char character) {
        int counter = 0;
        for (String word : words) {
            if (word.toLowerCase().startsWith(Character.toString(character).toLowerCase())) {
                counter++;
            }
        }
        return counter;
    }
}
