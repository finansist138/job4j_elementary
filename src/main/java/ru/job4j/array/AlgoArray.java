package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[3];
        array[3] = array[4];
        array[4] = array[0];
        array[0] = array[1];
        array[1] = array[2];
        array[2] = array[0];
        array[0] = temp;

        for (int rst : array) {
            System.out.println(rst);
        }
    }
}
