package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String rsl = "";
        for (int i = 0; i < num; i++) {
            if (num <= prizes.length) {
                rsl = prizes[i];

            } else if (num % prizes.length == 0) {
                num = prizes.length;
                rsl = prizes[i];

            } else {
                num = num % prizes.length;
                rsl = prizes[i];

            }
        }
        return rsl;
    }
}