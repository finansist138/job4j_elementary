package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] data = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                data[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int size = 5;
        int[][] rsl = multiple(size);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(Arrays.toString(rsl[i]));
        }
    }
}
