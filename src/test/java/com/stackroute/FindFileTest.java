package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindFileTest {
    private static FindFile test;
    @Before
    public void setUp() throws Exception {
        test = new FindFile();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void findFile_findFilesbyExtention_checkContent() {
        String expectedString;
        test.setFolderPath("../../../../../files");
        test.setFileExtention("java");
        expectedString = "This is java file";
        assertEquals("Failure", expectedString,test.findFile());

        assertNotNull(test.findFile().toString());

        test.setFileExtention("txt");
        expectedString = "This is txt file 1.This is txt file 2.This is txt file 3.";
        assertEquals("Failure", expectedString,test.findFile());

        test.setFileExtention("csv");
        assertNull(test.findFile());

    }
}