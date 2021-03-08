package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square1() {
        int expected1 = 3;
        int p = 12;
        int k = 3;
        double out1 = SqArea.square(p, k);
        Assert.assertEquals(expected1, out1, 0.01);
    }

    @Test
    public void square2() {
        int expected2 = 11;
        int p = 26;
        int k = 11;
        double out2 = SqArea.square(p, k);
        Assert.assertEquals(expected2, out2, 0.01);

    }
}