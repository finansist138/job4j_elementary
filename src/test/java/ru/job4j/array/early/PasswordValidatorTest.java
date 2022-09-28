package ru.job4j.array.early;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PasswordValidatorTest {

    @Test
    void passwordIsNotNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(null));
        assertThat(exception.getMessage()).isEqualTo("Password is not null");
    }

    @Test
    void passwordLength() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate("Java"));
        assertThat(exception.getMessage()).isEqualTo("8 <= password length <= 32");
    }

    @Test
    void lowercaseCharacter() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate("JOB4JAVA."));
        assertThat(exception.getMessage()).isEqualTo("The password must contain lowercase character");
    }

    @Test
    void uppercaseCharacter() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate("job4java."));
        assertThat(exception.getMessage()).isEqualTo("The password must contain uppercase character");
    }

    @Test
    void containNumber() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate("JOB.java"));
        assertThat(exception.getMessage()).isEqualTo("The password must contain a number");
    }

    @Test
    void containSymbol() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate("JOB4java"));
        assertThat(exception.getMessage()).isEqualTo("The password must contain a symbol");
    }

    @Test
    void notContainWords() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validateContinue("qWerty4java."));
        assertThat(exception.getMessage()).isEqualTo(""
                + "The password must not contain words: 'qwerty', '12345', 'password', 'admin', 'user'");
    }
}