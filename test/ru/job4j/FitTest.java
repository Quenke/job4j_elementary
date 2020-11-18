package ru.job4j;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenman180then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenwoman175() {
        short in = 175;
        double expected = 74.75;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenwoman110() {
        short in = 110;
        double expected = 0;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }
}