package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test(){
        int expected = 22;
        int actual = Students.getInstance().count();
        Assert.assertEquals(expected, actual);
    }
}
