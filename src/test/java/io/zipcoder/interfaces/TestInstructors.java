package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test(){

        int expected = 3;
        int actual = Instructors.getInstance().count();
        Assert.assertEquals(expected, actual);


    }
}
