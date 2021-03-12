package ru.job4j.condition;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DivideBySixTest {

    @Test
    public void whenNumberDivdeBy6() {
        String expected = "Исходное число делится на 6.";
        assertThat(DivideBySix.checkNumber(24), is(expected));
        }

        @Test
    public void whenNumberDivideBy3AndNotEven() {
        String expexted = "Исходное число делится на 3, но не является четным";
        assertThat(DivideBySix.checkNumber(9), is(expexted));
        }

        @Test
    public void whenNumberNoDivideBy3AndEvrn() {
        String expexted = "Исходное число не делится на 3, но является четным";
        assertThat(DivideBySix.checkNumber(14), is(expexted));
        }

        @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        String expexted = "Исходное число не делится на 3 и не является четным";
        assertThat(DivideBySix.checkNumber(25), is(expexted));
        }
}