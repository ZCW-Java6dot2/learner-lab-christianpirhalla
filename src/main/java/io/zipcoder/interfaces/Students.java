package io.zipcoder.interfaces;

public final class Students<E extends Student> extends People<Person> {

        private static final Students INSTANCE = new Students();



    private Students(){

        try {

            add(new Student(1, "Christian P"));
            add(new Student(2, "Amanda W"));
            add(new Student(3, "Christian A"));
            add(new Student(4, "Christine S"));
            add(new Student(5, "David T"));
            add(new Student(6, "Deon J"));
            add(new Student(7, "Earl A"));
            add(new Student(8, "Eric R"));
            add(new Student(9, "Gunjan P"));
            add(new Student(10, "Hillary G"));
            add(new Student(11, "Jarrell W"));
            add(new Student(12, "Kyle P"));
            add(new Student(13, "Michael B"));
            add(new Student(14, "Munir S"));
            add(new Student(15, "Nicole P"));
            add(new Student(16, "Nikkia O"));
            add(new Student(17, "Peter K"));
            add(new Student(18, "Peter O"));
            add(new Student(19, "Shubham A"));
            add(new Student(20, "Tom C"));
            add(new Student(21, "Will M"));
            add(new Student(22, "Zekai H"));
        }
        catch(NullPointerException n){
            System.out.println("cause: " + n.getCause());
        }

    }

    public Student[] toArray(){
        Student[] project = new Student[personList.size()];
        return personList.toArray(project);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
