package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder result = new StringBuilder();
        String rsl = " ";
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                rsl = "";
            }
            result.append(words[i]).append(rsl);
        }
        return result.toString();
    }
}