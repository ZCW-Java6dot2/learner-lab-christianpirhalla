package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    DOLIO(1),
    KRIS(2),
    CHRIS(3);

    private final Instructor instructor;
    private double timeWorked = 0;

    Educator(int instructorId) {
        switch(instructorId) {
            case 1:
                instructor = new Instructor(1, "Dolio D");
                break;

            case 2:
                instructor = new Instructor(2, "Kris Y");
                break;

            case 3:
                instructor = new Instructor(3, "Chris N");
                break;

            default:
                instructor = new Instructor(999, "Stranger");
                break;
        }
    }

    public double getTimeWorked(){
        return timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
