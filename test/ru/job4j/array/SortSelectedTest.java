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
    public void whenSort5Two() {
        int[] input = new int[]{11, 7, 8, 10, 9};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{7, 8, 9, 10, 11};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[]{8, 10, 9};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{8, 9, 10};
        assertThat(result, is(expect));
    }
}