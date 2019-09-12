package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlacesTest {
    private static Places test;
    @Before
    public void setUp() throws Exception {
        test = new Places();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }


    @Test
    public void removeVowels_PlaceNames_returnNamesWithoutVowels() {

        test.setPlaceNames(new String[]{"Seoul", "Amsterdam", "Kyoto"});
        assertArrayEquals("Failure", new String[]{"Sl", "Amstrdm", "Kyt"},test.RemoveVowels());

        test.setPlaceNames(new String[]{"Tokyo","Norway","Incheon","Prague"});
        assertArrayEquals("Failure", new String[]{"Tky","Nrwy","Inchn","Prg"},test.RemoveVowels());


    }
}

