package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    Instructor instructor = new Instructor(1996, "Christian");

    @Test
    public void testImplementation(){
        //Given
        Boolean expected = true;

        //When
        Boolean actual = (instructor instanceof Teacher);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testInheritance(){
        //Given
        Boolean expected = true;

        //When
        Boolean actual = (instructor instanceof Person);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTeach(){
        //Given
        Student student = new Student(12345, "Jeff");
        double expected = 2.0;

        //When
        instructor.teach(student, 2.0);
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, .00001);
    }

    @Test
    public void testLecture(){
        //Given
        Student s1 = new Student(12345, "Rick");
        Student s2 = new Student (23456, "Morty");
        Student[] students = {s1, s2};
        double expected = 2;

        //When
        instructor.lecture(students, 4);
        double actual1 = s1.getTotalStudyTime();
        double actual2 = s2.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual1, .00001);
        Assert.assertEquals(expected, actual2, .00001);

    }
}
