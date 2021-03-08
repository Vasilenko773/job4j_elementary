package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan178Then89() {
        short inm = 178;
        double expectedm = 89.69;
        double outm = Fit.manWeight(inm);
        Assert.assertEquals(expectedm, outm, 0.01);
    }

    @Test
    public void whenWoman178Then78() {
        short inw = 178;
        double expectedw = 78;
        double outw = Fit.womanWeight(inw);
        Assert.assertEquals(expectedw, outw, 0.01);
    }
}