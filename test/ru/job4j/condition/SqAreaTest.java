package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void square6a2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square11a4() {
        int expected = 4;
        int p = 11;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square28a5() {
        int expected = 20;
        int p = 28;
        int k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square150a175() {
        int expected = 180;
        int p = 150;
        int k = 20;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square1247a100() {
        int expected = 2775;
        int p = 1247;
        int k = 111;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}