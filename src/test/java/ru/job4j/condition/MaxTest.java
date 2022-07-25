package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2To3To4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int expected = 4;
        int result = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To2To5To4Then5() {
        int first = 1;
        int second = 2;
        int third = 5;
        int fourth = 4;
        int expected = 5;
        int result = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax6To2To3To4Then6() {
        int first = 6;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int expected = 6;
        int result = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, result);
    }
}