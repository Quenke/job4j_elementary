package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortfive() {
        int[] input = new int[]{9, 5, 7, 6, 8};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{5, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortthree() {
        int[] input = new int[]{6, 5, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{4, 5, 6};
        assertThat(result, is(expect));
    }
}