package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class TestPerson {

    @Test
    public void testConstructor(){
        //Given
        String expectedName = "Joey";
        long expectedId = 31415677;
        Person person = new Person(expectedId, expectedName);

        //When
        String actualName = person.getName();
        long actualId = person.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName(){
        //Given
        String expectedName = "Seth";
        Person person = new Person(12345, "dumb name");
        person.setName(expectedName);

        //When
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);

    }
}
