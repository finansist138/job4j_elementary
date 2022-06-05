package ru.job4j.condition;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int posL = 0, posR = 0;
        for (int i = 0; i < rsl.length; i++) {

            if (posR == left.length) {
                rsl[i] = right[i - posR];

            } else if (posL == right.length) {
                rsl[i] = left[i - posL];

            } else if (left[i - posL] < right[i - posR]) {
                rsl[i] = left[i - posL];
                posR++;

            } else {
                rsl[i] = right[i - posR];
                posL++;
            }
        }
        return rsl;
    }
}





