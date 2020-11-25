package io.zipcoder.interfaces;

import java.util.HashMap;

public class ZipCodeWilmington {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Student[]) students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Teacher teacher = (Teacher) instructors.findById(id);
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student, Double> studyMap = new HashMap<Student, Double>();
        Student[] mapStudents = students.toArray();
        for (Student p : mapStudents){
            studyMap.put(p, p.getTotalStudyTime());
        }
        return studyMap;
    }
}
