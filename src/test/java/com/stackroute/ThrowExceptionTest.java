package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ThrowExceptionTest {
    private static ThrowException test;
    @Before
    public void setUp() throws Exception {
        test = new ThrowException();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void ExceptionTest_throwsException_ChecksPrintedMessage(){
        test.main();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        assertEquals("Failure", "Error Message\nBatman\n",outContent.toString());

    }

    @Test
    public void ExceptionTest_throwsException_ChecksPrintedMessageFailure(){
        test.main();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        assertNotEquals("Failure", "Error Message\nSuperman\n",outContent.toString());

        assertNotNull("Failure",outContent.toString());
    }
}