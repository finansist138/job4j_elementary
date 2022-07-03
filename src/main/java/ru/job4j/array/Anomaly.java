package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int[] rsl = new int[data.length];
        int count = 0;
        int index = 0;
        int commonCount = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= up || data[i] <= down) {
                rsl[index++] = i;
                count++;
                if (count == 1) {
                    result[commonCount] = new int[]{i, i};
                    commonCount++;
                } else {
                    commonCount--;
                    result[commonCount] = Arrays.copyOf(rsl, count);
                    commonCount++;
                    index = 0;
                    count = 0;
                }
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}

