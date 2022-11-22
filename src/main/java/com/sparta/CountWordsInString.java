package com.sparta;

public class CountWordsInString {

    //    method with inout parameters: String, Character
    public static int countWordsInString(String word, Character character) {
        int counter = 0;
        String[] s = word.split(" ");
        for (String w : s) {
            if (w.toLowerCase().startsWith(character.toString().toLowerCase())) {
                counter++;
            }
        }
        return counter;
    }

    //    method with input parameters: String, char
    public static int countWordsInString(String word, char character) {
        int counter = 0;
        String[] s = word.split(" ");
        for (String w : s) {
            if (w.toLowerCase().startsWith(Character.toString(character).toLowerCase())) {
                counter++;
            }
        }
        return counter;
    }
}
