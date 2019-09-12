package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveTest {
    private static Consecutive test;
    @Before
    public void setUp() throws Exception {
        test = new Consecutive();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void checkConsecutive_StringOfNumbers_returnBooleanValue() {

        test.setNumbers("121,122,123,124");
        assertEquals("Failure", true,test.checkConsecutive());

        test.setNumbers("121,1243,123,124");
        assertEquals("Failure", false,test.checkConsecutive());

        test.setNumbers("1,2,3,4,5");
        assertEquals("Failure", true,test.checkConsecutive());

    }

    @Test
    public void checkConsecutive_StringOfNumbers_returnBooleanValueFailure(){

        test.setNumbers("43,44,46,47");
        assertNotEquals("Failure", true,test.checkConsecutive());
    }
}