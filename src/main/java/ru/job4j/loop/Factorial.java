package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        if (n >= 1) {
            result = result + 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        } else {
            result = result + 1;
        }
        return result;
    }
}
