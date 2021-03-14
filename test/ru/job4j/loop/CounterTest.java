package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expexted = 30;
        Assert.assertEquals(expexted, result);
    }

    @Test
    public void whenSumOneToForty() {
        int start = 1;
        int finish = 40;
        int result = Counter.sumByEven(start, finish);
        int expexted = 420;
        Assert.assertEquals(expexted, result);
    }
}
