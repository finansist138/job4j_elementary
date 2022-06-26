package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            count++;
        }
        for (int i = 0; i < right.length; i++) {
            rsl[count++] = right[i];
        }
        if (rsl.length > 1) {
            int sum = 0;
            for (int i = 1; i < rsl.length; i++) {
                if (rsl[i - 1] == rsl[i]) {
                    sum = 1;
                    rsl[i - 1] = 0;
                    rsl[i] = 0;
                    sum++;
                }
            }
            if (sum == rsl.length) {
                rsl = new int[]{};
            } else {
                Arrays.sort(rsl);
                return Arrays.copyOfRange(rsl, sum, rsl.length);
            }
        }
        return rsl;
    }
}
