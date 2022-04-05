package COSC2440.student;

import java.util.List;

import COSC2440.ReadCSV.ReadCSV;
import COSC2440.check.ReadList;
import COSC2440.enrollment.StudentEnrollmentSystem;

public class Student extends StudentEnrollmentSystem {
    String name;
    String id;
    String birthdate;
    int currentItem = 0;
    String compare;

    public void toCompare(String compare) {
        this.compare = compare;
    }

    List<Student> students = ReadCSV.readCSVStudent("COSC2440\\src\\dafalut.csv");
    
    public Student(String id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Student() {}

    public static Student createStudent(String id, String name, String birhtdate) {
        return new Student(id, name, birhtdate);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String toString() {
        return "Student ID: " + id + " " + "| Student name: " + name + " " + "| Birthdate: " + birthdate;
    } 

}

