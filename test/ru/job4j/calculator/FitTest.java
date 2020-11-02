package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {



    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }


}