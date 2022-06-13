package ru.job4j.array;

import java.util.Arrays;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] rsl = new int[right.length + 1];
        for (int i = 0; i < left.length; i++) {
            rsl[0] = left[0];
            rsl[rsl.length - 1] = left[left.length - 1];
        }
        for (int i = 0; i < middle.length; i++) {
            if (i % 2 != 0) {
                rsl[i + 1] = middle[i];
            }
        }
        for (int i = 0; i < right.length; i++) {
            if (i % 2 == 0) {
                rsl[i + 1] = right[i];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3, 4, 5};
        int[] middle = {6, 7, 8, 9, 10};
        int[] right = {11, 12, 13, 14, 15, 16};
        System.out.println(Arrays.toString(union(left, middle, right)));
    }
}