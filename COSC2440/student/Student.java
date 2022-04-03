package COSC2440.student;

import java.util.List;

import COSC2440.ReadCSV.ReadCSV;

public class Student{
    String name;
    String id;
    String birthdate;

    List<Student> students = ReadCSV.readCSVStudent("COSC2440\\src\\dafalut.csv");
    
    public Student(String id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Student() {
    }

    public static Student createStudent(String id, String name, String birhtdate) {
        return new Student(id, name, birhtdate);
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

