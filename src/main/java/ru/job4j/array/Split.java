package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        char[] rsl = new char[str.length + 2];
        int commonCount = 0;
        int index = 0;
        int r = 0;
                for (int i = 0; i < str.length; i++) {
                    if (str[i] != c) {
                        rsl[r++] = str[i];
                        commonCount++;
                    } else {
                        result[index] = Arrays.copyOf(rsl, commonCount);
                        index++;
                        commonCount = 0;
                        r = 0;
                    }
                }
                result[index] = Arrays.copyOf(rsl, commonCount);
                return Arrays.copyOf(result, index + 1);
    }
}
