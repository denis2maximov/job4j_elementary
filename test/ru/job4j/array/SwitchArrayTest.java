package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap4to7() {
        int[] input = {3, 2, 4, 7};
        int[] expect = {3, 2, 7, 4};
        int[] rsl = SwitchArray.swap(input, 2, 3);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap10to20() {
        int[] input = {3, 2, 4, 7, 10, 20, 100500};
        int[] expect = {3, 2, 4, 7, 20, 10, 100500};
        int[] rsl = SwitchArray.swap(input, input.length - 3, 5);
        assertThat(rsl, is(expect));
    }

}