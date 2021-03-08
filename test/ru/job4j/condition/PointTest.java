package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then1() {
        int expexted1 = 3;
        int x3 = 1;
        int y3 = 0;
        int x4 = 2;
        int y4 = 0;
        double out1 = Point.distance(x3, y3, x4, y4);
        Assert.assertEquals(expexted1, out1, 0.01);
    }

    @Test
    public void when16to34then3() {
        double expexted2 = 2.82;
        int x5 = 1;
        int y5 = 6;
        int x6 = 3;
        int y6 = 4;
        double out2 = Point.distance(x5, y5, x6, y6);
        Assert.assertEquals(expexted2, out2, 0.01);
    }

    @Test
    public void when24to78then5() {
        double expexted3 = 6.4;
        int a = 2;
        int b = 4;
        int c = 7;
        int d = 8;
        double out3 = Point.distance(a, b, c, d);
        Assert.assertEquals(expexted3, out3, 0.01);
    }
}