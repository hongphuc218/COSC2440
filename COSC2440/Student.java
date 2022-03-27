package COSC2440;
import java.util.Date;

public class Student {
    String name;
    int id;
    Date birthdate;

    public Student (String name, int id, Date birthdate) {
        this.name = name;
        this.id = id;
        this.birthdate = birthdate;
    }
    

    public String getStudentName() {
        return name;
    }

    public int getStudentID() {
        return id;
    }

}

