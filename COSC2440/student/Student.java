package COSC2440.student;

import COSC2440.ReadCSV.PrintOut;

public class Student implements PrintOut{
    String name;
    String id;
    String birthdate;

    
    
    public Student(String id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public static Student createStudent(String id, String name, String birhtdate) {
        return new Student(id, name, birhtdate);
    }
    
    public String toString() {
        return "Student ID: " + id + " " + "| Student name: " + name + " " + "| Birthdate: " + birthdate;
    }

    public String[] toPrint(){
        return new String[]{this.id, this.name, this.birthdate};
    
      }    

}

