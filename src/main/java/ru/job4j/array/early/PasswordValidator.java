package ru.job4j.array.early;

import static java.lang.Character.*;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password is not null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("8 <= password length <= 32");
        }
        if (password.equals(password.toUpperCase())) {
            throw new IllegalArgumentException("The password must contain lowercase character");
        }
        if (password.equals(password.toLowerCase())) {
            throw new IllegalArgumentException("The password must contain uppercase character");
        }
        char[] chars = password.toCharArray();
        int sum = 0;
        for (char pas : chars) {
            if (isDigit(pas)) {
                sum++;
                break;
            }
        }
        if (sum == 0) {
            throw new IllegalArgumentException("The password must contain a number");
        }
        sum = 0;
        for (char pas : chars) {
            if (!isLetterOrDigit(pas)) {
                sum++;
                break;
            }
        }
        if (sum == 0) {
            throw new IllegalArgumentException("The password must contain a symbol");
        }
        return password;
    }

    public static String validateContinue(String password) {
        String[] words = new String[]{"qwerty", "12345", "password", "admin", "user"};
        for (String word : words) {
            if (password.toLowerCase().contains(word)) {
                throw new IllegalArgumentException("The password must not contain words:"
                        + " 'qwerty', '12345', 'password', 'admin', 'user'");
            }
        }
        return password;
    }
}
