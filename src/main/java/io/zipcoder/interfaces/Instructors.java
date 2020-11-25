package io.zipcoder.interfaces;

public final class Instructors<E extends Instructor> extends People<Person> { // Why does this not work w/o <Person> ???

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        add(new Instructor(1, "Dolio D"));
        add(new Instructor(2, "Kris Y"));
        add(new Instructor(3, "Chris N"));
    }


    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor[] toArray(){
        Instructor[] project = new Instructor[personList.size()];
        return personList.toArray(project);
    }
}
