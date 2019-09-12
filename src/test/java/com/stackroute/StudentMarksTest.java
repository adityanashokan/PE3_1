package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    private static StudentMarks test;
    @Before
    public void setUp() throws Exception {
        test = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void isGradeValid_GradesInvalid_ShouldReturnFalse(){
        test.setnumOfStudents(5);
        test.setstuGrades(new int[]{44, 67, 99, 85, 77});
        assertEquals("Failed",true,test.isGradeValid());
        test.setnumOfStudents(4);
        test.setstuGrades(new int[]{-67, 101, 85, 77});
        assertEquals("Failed",false,test.isGradeValid());
        test.setnumOfStudents(0);
        test.setstuGrades(null);
        assertNull("Failed",test.isGradeValid());
    }

    @Test
    public void isGradeValidFailure_GradesInvalid_ShouldReturnFalse(){
        test.setnumOfStudents(5);
        test.setstuGrades(new int[]{29, 54, 101, 36, 41});
        assertNotEquals("Failed",true,test.isGradeValid());
        test.setnumOfStudents(5);
        test.setstuGrades(new int[]{29, 54, 101, 36, 41});
        assertNotNull("Failure",test.isGradeValid());
    }
}