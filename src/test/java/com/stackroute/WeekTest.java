package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeekTest {
    private static Week test;
    @Before
    public void setUp() throws Exception {
        test = new Week();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void getFirstDate_DateAsString_FirstDayofWeekAsString() {

        test.setDate("12/12/2012");
        assertEquals("Failure","10/12/2012",test.getFirstDate());

        test.setDate("07/08/2009");
        assertEquals("Failure","03/08/2009",test.getFirstDate());
    }

    @Test
    public void getLastDate_DateAsString_LastDayofWeekAsString() {

        test.setDate("12/12/2012");
        assertEquals("Failure","16/12/2012",test.getLastDate());

        test.setDate("07/08/2009");
        assertEquals("Failure","09/08/2009",test.getLastDate());
    }

    @Test
    public void getFirstDate_DateAsString_FirstDayofWeekAsStringFailure(){
        test.setDate("12/12/2012");
        assertNotNull("Failure",test.getFirstDate());
        assertNotEquals("Failure","07/08/2009",test.getFirstDate());
    }

    @Test
    public void getLasttDate_DateAsString_LastDayofWeekAsStringFailure(){
        test.setDate("07/08/2009");
        assertNotNull("Failure",test.getLastDate());
        assertNotEquals("Failure","12/12/2012",test.getLastDate());
    }
}