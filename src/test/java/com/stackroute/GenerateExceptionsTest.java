package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GenerateExceptionsTest {
    private static GenerateExceptions test;
    @Before
    public void setUp() throws Exception {
        test = new GenerateExceptions();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void generateNegativeArraySizeException_throwsException_checkException() {
        thrown.expect(NegativeArraySizeException.class);
        thrown.expectMessage("NegativeArraySizeException");
        test.generateNegativeArraySizeException();
    }

    @Test
    public void generateIndexOutOfBoundsException_throwsException_checkException() {
        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("IndexOutOfBoundsException");
        test.generateIndexOutOfBoundsException();
    }

    @Test
    public void generateNullPointerException_throwsException_checkException() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("NullPointerException");
        test.generateNullPointerException();
    }
}