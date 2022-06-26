package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl;
        if (left.length > 0) {
            rsl = new int[left.length];
            for (int i = 0; i < left.length; i++) {
                rsl[i] = left[i];
            }
            int sum = 0;
            for (int j = 0; j < rsl.length; j++) {
                for (int i = 0; i < right.length; i++) {
                    if (rsl[j] == right[i]) {
                        rsl[j] = 0;
                        sum++;
                    }
                }
            }
            Arrays.sort(rsl);
            return Arrays.copyOfRange(rsl, sum, rsl.length);
        } else {
            rsl = new int[left.length];
        }
        return rsl;
    }
}
