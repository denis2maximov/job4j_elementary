package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Game1Test {
    @Test
    public void checkGame11() {
        int rsl = Game1.checkGame1(0.2, 50, 9);
        assertThat(rsl, is(1));
    }

    @Test
    public void checkGameIs10() {
        int rsl = Game1.checkGame1(0.9, 1, 2);
        assertThat(rsl, is(0));
    }
}