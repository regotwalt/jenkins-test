package com.rachelgotwalt;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    @Test
    public void add_should_add_two_numbers() {
       assertEquals(2, Adder.add(1, 1));
    }

}
