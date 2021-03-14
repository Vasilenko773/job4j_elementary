package ru.job4j.loop;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalcalculateFactoraialForFiveThenOneHundreadTwenty() {
        int result =  Factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(0);
        assertThat(result, is(1));
    }
}
   // int n = 5;
    //int result = Factorial.calc(n);
    //int exexted = 120;
    //assertThat(exexted, result);