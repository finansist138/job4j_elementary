package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 2; i <= number; i++) {
            if (number % 2 != 0 && number % i == 0) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}
