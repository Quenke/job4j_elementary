package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenfirstMax() {
        int result = MultiMax.max(5, 4, 2);
        assertThat(result, is(5));
    }
    @Test
    public void whenthirdMax() {
        int result = MultiMax.max(1, 4, 8);
        assertThat(result, is(8));
    }
    @Test
    public void wheneq() {
        int result = MultiMax.max(1, 1, 1);
        assertThat(result, is(1));
    }
}