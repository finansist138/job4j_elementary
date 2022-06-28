package ru.job4j.array;

public class RightShift {
    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }
    
    private static void shift(int[] nums) {
//        int temp = nums[nums.length - 1];
//        for (int i = nums.length - 1; i > 0; i--) {
//            nums[i] = nums[i - 1];
//        }
//        nums[0] = temp;

        for (int i = nums.length - 1; i > 0; i--) {
            int temp = nums[i];
            nums[i] = nums[i - 1];
            nums[i - 1] = temp;
        }
    }
}
