package ru.job4j.array;

import java.util.Arrays;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        for (int j = array[row].length - 2; j >= column; j--) {
            array[row][j + 1] = array[row][j];
        }
        for (int j = 1; j <= column; j++) {
            array[row][j - 1] = array[row][j];
        }
        for (int i = array.length - 2; i >= row; i--) {
            array[i + 1][column] = array[i][column];
        }
        for (int i = 1; i <= row; i++) {
            array[i - 1][column] = array[i][column];
        }
        array[row][column] = 0;
    }

}