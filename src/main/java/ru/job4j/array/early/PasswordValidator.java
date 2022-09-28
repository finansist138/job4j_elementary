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
        for (int i = 0; i < chars.length; i++) {
            if (!isDigit(chars[i])) {
                sum++;
                if (sum != i + 1) {
                    throw new IllegalArgumentException("The password must contain a number");
                }
            }
        }
        sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (isLetterOrDigit(chars[i])) {
                sum++;
                if (sum != i + 1) {
                    throw new IllegalArgumentException("The password must contain a symbol");
                }
            }
        }
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
