package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    Student student = new Student(21, "Jeff");

    @Test
    public void testImplementation(){
        //Given
        Boolean expected = true;

        //When
        Boolean actual = (student instanceof Learner);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testInheritance(){
        //Given
        Boolean expected = true;

        //When
        Boolean actual = (student instanceof Person);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn(){
        //Given
        double expected = 2.0;
        student.learn(expected);

        //When
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, .000001);
    }
}
