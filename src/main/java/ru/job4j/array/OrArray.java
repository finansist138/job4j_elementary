package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            count++;
        }
        for (int j = 0; j < right.length; j++) {
            rsl[count++] = right[j];
        }
        Arrays.sort(rsl);
        int sum = 0;
        for (int i = 1; i < rsl.length; i++) {
            if (rsl[i - 1] == rsl[i]) {
                sum++;
            }
        }
        for (int i = 1; i < rsl.length; i++) {
            if (rsl[i - 1] == rsl[i]) {
                rsl[i - 1] = 0;
                int temp = rsl[i - 1];
                rsl[i - 1] = rsl[i];
                rsl[i] = temp;
            }
        }
        Arrays.sort(rsl);
        return Arrays.copyOfRange(rsl, sum, rsl.length);
    }
}






