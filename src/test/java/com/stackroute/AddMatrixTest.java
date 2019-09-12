package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddMatrixTest {
    private static AddMatrix test1;
    private static AddMatrix test2;
    private static AddMatrix test3;
    @Before
    public void setUp() throws Exception {
        test1 = new AddMatrix();
        test2 = new AddMatrix();
        test3 = new AddMatrix();
    }

    @After
    public void tearDown() throws Exception {
        test1 = null;
        test2 = null;
        test3 = null;
    }

    @Test
    public void AddMatrix_Summation_returnSum() {
        test1.setNumOfColumns(3);
        test1.setNumOfRows(3);
        test1.setMatrix(new int[][]{{1, 1, 1},{1, 1, 1}, {1, 1, 1}});

        test2.setNumOfColumns(3);
        test2.setNumOfRows(3);
        test2.setMatrix(new int[][]{{9, 9, 9},{9, 9, 9},{9, 9, 9}});

        test3.setNumOfColumns(3);
        test3.setNumOfRows(3);
        test3.setMatrix(new int[][]{{10, 10, 10},{10, 10, 10},{10, 10, 10}});

        assertEquals("Failure",test3.toString(),test1.AddMatrix(test2).toString());

        test1.setNumOfColumns(2);
        test1.setNumOfRows(3);
        test1.setMatrix(new int[][]{{5,5},{5,5}, {5,5}});

        test2.setNumOfColumns(2);
        test2.setNumOfRows(3);
        test2.setMatrix(new int[][]{{4,4},{4,4},{4,4}});

        test3.setNumOfColumns(2);
        test3.setNumOfRows(3);
        test3.setMatrix(new int[][]{{9,9},{9,9},{9,9}});

        assertEquals("Failure",test3.toString(),test1.AddMatrix(test2).toString());

        test1.setNumOfColumns(2);
        test1.setNumOfRows(2);
        test1.setMatrix(new int[][]{{6,6},{6,6}, {6,6}});

        test2.setNumOfColumns(2);
        test2.setNumOfRows(2);
        test2.setMatrix(new int[][]{{4,4},{4,4},{4,4}});

        test3.setNumOfColumns(2);
        test3.setNumOfRows(2);
        test3.setMatrix(new int[][]{{10,10},{10,10},{10,10}});

        assertEquals("Failure",test3.toString(),test1.AddMatrix(test2).toString());

    }

    @Test
    public void addMatrixFailure_Summation_returnSum(){
        test1.setNumOfColumns(3);
        test1.setNumOfRows(3);
        test1.setMatrix(new int[][]{{3, 3, 3},{3, 3, 3}, {3, 3, 3}});

        test2.setNumOfColumns(3);
        test2.setNumOfRows(3);
        test2.setMatrix(new int[][]{{9, 9, 9},{9, 9, 9},{9, 9, 9}});

        test3.setNumOfColumns(3);
        test3.setNumOfRows(3);
        test3.setMatrix(new int[][]{{101, 11, 11},{11, 11, 101},{11, 101, 11}});

        assertNotEquals("Failure",test3.toString(),test1.AddMatrix(test2).toString());
    }
}