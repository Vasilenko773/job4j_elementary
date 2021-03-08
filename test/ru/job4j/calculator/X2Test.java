package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B0C0X1Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expeced = 40;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expeced, rsl);
        }

        @Test

                public void whenA1B1C1X1Then1() {
            int a1 = 1;
            int b1 = 1;
            int c1 = 1;
            int x1 = 1;
            int expeced1 = 3;
            int rsl1 = X2.calc(a1, b1, c1, x1);
            Assert.assertEquals(expeced1, rsl1);
        }

        @Test

    public void whenA0B1C1X1Then1() {
        int a2 = 0;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;
        int expeced2 = 2;
        int rsl2 = X2.calc(a2, b2, c2, x2);
Assert.assertEquals(expeced2, rsl2);
    }

    @Test

    public void whenA1B1C1X0() {
        int a3 = 1;
        int b3 = 1;
        int c3 = 1;
        int x3 = 0;
        int expeced3 = 1;
        int rsl3 = X2.calc(a3, b3, c3, x3);
        Assert.assertEquals(expeced3, rsl3);
    }

    @Test

    public void whenA1B1C0X1() {
        int a4 = 1;
        int b4 = 1;
        int c4 = 0;
        int x4 = 1;
        int expected4 = 2;
        int rsl4 = X2.calc(a4, b4, c4, x4);
        Assert.assertEquals(expected4, rsl4);
    }
   }