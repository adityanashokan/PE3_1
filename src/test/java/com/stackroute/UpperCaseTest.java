package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class UpperCaseTest {
    private static UpperCase test;
    @Before
    public void setUp() throws Exception {
        test = new UpperCase();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void convertToUpperCase_giveRawText_checkIfTurnedToUpperCase(){

        String filePath = "../../../../../files/text1.txt"; //Change as necessary
        String expectedText = "LED ZEPPELIN WERE AN ENGLISH ROCK BAND FORMED IN LONDON IN 1968. THE GROUP CONSISTED OF VOCALIST ROBERT PLANT, GUITARIST JIMMY PAGE, BASSIST/KEYBOARDIST JOHN PAUL JONES AND DRUMMER JOHN BONHAM. ALONG WITH BLACK SABBATH AND DEEP PURPLE, THE BAND'S HEAVY, GUITAR-DRIVEN SOUND HAS LED THEM TO BE CITED AS ONE OF THE ORIGINATORS OF HEAVY METAL. THEIR STYLE DREW FROM A WIDE VARIETY OF INFLUENCES, INCLUDING BLUES, PSYCHEDELIA AND FOLK MUSIC.";
        test.setFile(filePath);
        test.printFile();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        assertEquals("Failure", expectedText, outContent.toString());

        expectedText = "LED ZEPPELIN WERE AN english rock band FORMED IN LONDON IN 1968. THE GROUP CONSISTED OF VOCALIST ROBERT PLANT, GUITARIST JIMMY PAGE, BASSIST/KEYBOARDIST JOHN PAUL JONES AND DRUMMER JOHN BONHAM. ALONG WITH BLACK SABBATH AND DEEP PURPLE, THE BAND'S HEAVY, GUITAR-DRIVEN SOUND HAS LED THEM TO BE CITED AS ONE OF THE ORIGINATORS OF HEAVY METAL. THEIR STYLE DREW FROM A WIDE VARIETY OF INFLUENCES, INCLUDING BLUES, PSYCHEDELIA AND FOLK MUSIC.";

        assertNotEquals("Failure", expectedText, outContent.toString());

    }
}