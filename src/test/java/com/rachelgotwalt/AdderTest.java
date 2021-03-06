package com.rachelgotwalt;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for the {@link Adder} class. Dumb, but used for Jenkins triggering. So annoying.
 */
public class AdderTest {

    @Test
    public void add_should_add_two_positive_numbers() {
       assertEquals(2, Adder.add(1, 1));
       assertEquals(4, Adder.add(1, 3));
    }

    @Test
    public void add_should_add_two_negative_numbers() {
        assertEquals(-2, Adder.add(-1, -1));
        assertEquals(-3, Adder.add(-1, -2));
    }

    @Test
    public void add_should_add_positive_and_negative_numbers() {
        assertEquals(-1, Adder.add(1, -2));
        assertEquals(0, Adder.add(1, -1));
    }

    @Test
    public void add_should_add_zero() {
        assertEquals(0, Adder.add(0, 0));
        assertEquals(1, Adder.add(0, 1));
    }

    @Test
    public void add_should_add_three_positive_numbers() {
        assertEquals(3, Adder.add(1, 1, 1));
        assertEquals(6, Adder.add(1, 2, 3));
    }

    @Test
    public void add_should_add_three_negative_numbers() {
        assertEquals(-3, Adder.add(-1, -1, -1));
        assertEquals(-5, Adder.add(-1, -1, -3));
    }

    @Test
    public void add_should_add_three_mixed_numbers() {
        assertEquals(-1, Adder.add(3, -5, 1));
        assertEquals(-4, Adder.add(3, -5, -2));
    }

    @Test
    public void add_should_add_three_zeros() {
        assertEquals(0, Adder.add(0, 0, 0));
    }

}
