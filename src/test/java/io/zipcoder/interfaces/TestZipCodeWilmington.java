package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestZipCodeWilmington {
    ZipCodeWilmington zcw = new ZipCodeWilmington();
    @Test
    public void testHostLectureOld(){
        //Given
        Boolean expected = true;
        HashMap<Student, Double> studentMapCopy = (HashMap<Student, Double>) zcw.getStudyMap().clone();
        Double hoursTaught = 22.0;
        zcw.hostLecture(1, hoursTaught);

        //When
        Boolean actual = true;
        for (Student s : zcw.getStudyMap().keySet()){
            if (s.getTotalStudyTime() != studentMapCopy.get(s) + 1){
                actual = false;
            }
        }

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHostLectureNew(){
        //Given
        Boolean expected = true;
        HashMap<Student, Double> studentMapCopy = (HashMap<Student, Double>) zcw.getStudyMap().clone();
        Double hoursTaught = 22.0;
        zcw.hostLecture(Educator.CHRIS, hoursTaught);

        //When
        Boolean actual = true;
        for (Student s : zcw.getStudyMap().keySet()){
            if (s.getTotalStudyTime() != studentMapCopy.get(s) + 1){
                actual = false;
            }
        }

        //Then
        Assert.assertEquals(expected, actual);
    }
}
