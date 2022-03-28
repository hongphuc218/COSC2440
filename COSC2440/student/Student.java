package COSC2440.student;
import java.util.Date;

public class Student {
    String name;
    String id;
    Date birthdate;

    public Student (String id, String name, Date birthdate) {
        this.name = name;
        this.id = id;
        this.birthdate = birthdate;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String toString() {
        return "Student ID: " + id + " " + "| Student name: " + name + " " + "| Birthdate: " + birthdate;
    }
}

