package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencyTest {
    public static Frequency test;
    @Before
    public void setUp() throws Exception {
        test = new Frequency();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void findFrequency_givesFilePath_returnFrequencyAsString() {
        test.setFilePath("../../../../../files/textDemo.txt");
        String expectedResult = "i-3,am-1,a-2,man-1,like-1,to-1,sleep-1,have-1,home-1";
        assertEquals("Failure", expectedResult,test.findFrequency());

        expectedResult = "i-2,am-2,a-1,man-2,like-1,to-1,sleep-1,have-1,home-1";
        assertNotEquals("Failure", expectedResult,test.findFrequency());


    }
}