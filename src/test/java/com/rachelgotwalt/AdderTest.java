package com.rachelgotwalt;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    @Test
    public void add_should_add_two_numbers() {
       assertEquals(2, Adder.add(1, 1));
    }

    @Test
    public void add_should_add_two_negative_numbers() {
        assertEquals(-2, Adder.add(-1, -1));
    }

    @Test
    public void add_should_add_positive_and_negative_numbers() {
        assertEquals(-1, Adder.add(1, -2));
    }

    @Test
    public void add_should_add_zero() {
        assertEquals(0, Adder.add(0, 0));
    }

}
