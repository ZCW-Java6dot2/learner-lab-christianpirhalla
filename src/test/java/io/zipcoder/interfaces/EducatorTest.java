package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    Educator ed = Educator.KRIS;

    @Test
    public void testImplementation(){
        //Given
        boolean expected = true;

        //When
        boolean actual = (ed instanceof Teacher);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTeach(){
        //Given
        double expected = ed.getTimeWorked() + 2;

        //When
        ed.teach(Students.getInstance().toArray()[5], 2);
        double actual = ed.getTimeWorked();

        //then
        Assert.assertEquals(expected, actual, .0000001);
    }

    @Test
    public void testLecture(){
        //Given
        double expected = ed.getTimeWorked() + 2;

        //When
        ed.lecture(Students.getInstance().toArray(), 2);
        double actual = ed.getTimeWorked();

        //Then
        Assert.assertEquals(expected, actual, .000001);

    }


}
