package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                index += 1;
            }
        }
        int k = 0;
        int[] rsl = new int[index];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl[k++] = array[i][j];
            }
        }
        double a = Math.ceil(Math.sqrt(rsl.length));
        int[][] finish = new int[(int) a][(int) a];
        for (int i = 0; i < finish.length; i++) {
            for (int j = 0; j < finish.length; j++) {

                if (i * finish.length + j >= rsl.length) {
                    finish[i][j] = 0;
                } else {
                    finish[i][j] = rsl[i * finish.length + j];
                }
            }
        }
        return finish;
    }
}
