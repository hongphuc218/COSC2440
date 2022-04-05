package COSC2440.course;

import java.util.List;

import COSC2440.ReadCSV.ReadCSV;
import COSC2440.enrollment.StudentEnrollmentSystem;

public class Course extends StudentEnrollmentSystem {
    String id;
    String name;
    int credit;

    List<Course> courses = ReadCSV.readCSVCourse("COSC2440\\src\\default.csv");

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
