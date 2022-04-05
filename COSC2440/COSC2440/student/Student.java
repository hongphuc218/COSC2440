package COSC2440.student;

import COSC2440.enrollment.StudentEnrollmentSystem;

public class Student extends StudentEnrollmentSystem {
    String name;
    String id;
    String birthdate;
    
    public Student(String id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Student() {}

    public static Student createStudent(String id, String name, String birthdate) {
        return new Student(id, name, birthdate);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Student ID: " + id + " " + "| Student name: " + name + " " + "| Birthdate: " + birthdate;
    }
}

