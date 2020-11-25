package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    public void learn(double hours){
        totalStudyTime += hours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
