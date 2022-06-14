package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        double a = Math.ceil(Math.sqrt(array.length));
        int[][] rsl = new int[(int) a][(int) a];
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl.length; j++) {
                if (i * rsl.length + j >= array.length) {
                    rsl[i][j] = 0;
                } else {
                    rsl[i][j] = array[i * rsl.length + j];
                }
                }
            }
        return rsl;
        }
    }
