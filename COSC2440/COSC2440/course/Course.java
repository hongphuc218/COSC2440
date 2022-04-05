package COSC2440.course;

import COSC2440.enrollment.StudentEnrollmentSystem;

public class Course extends StudentEnrollmentSystem {
    String id;
    String name;
    int credit;

    public Course(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public Course(){}

    
    public static Course createCourse(String id, String name, int credit) {
        return new Course(id, name, credit);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Course ID: " + id + " " + "| Course name: " + name + " " + "| Number of credits: " + credit;
    }
}
