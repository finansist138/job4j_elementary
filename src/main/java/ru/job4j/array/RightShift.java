package ru.job4j.array;

import java.util.Arrays;

public class RightShift {
    public static void shift(int[] nums, int count) {
           int[] rsl = new int[nums.length];
            if (count < nums.length) {
                System.arraycopy(nums, nums.length - count, rsl, 0, count);
                System.arraycopy(nums, 0, rsl, count, nums.length - count);

            } else {
                System.arraycopy(nums, 0, rsl, 0, nums.length);
            }
        System.out.println(Arrays.toString(rsl));
    }

    // метод делает сдвиг с шагом 1
        private static void shift(int[] nums) {

        }
    }
