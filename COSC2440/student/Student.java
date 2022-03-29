package COSC2440.student;

public class Student {
    String name;
    String id;
    String birthdate;

    
    
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

    public String toString() {
        return "Student ID: " + id + " " + "| Student name: " + name + " " + "| Birthdate: " + birthdate;
    }

    public Student createStudent(String string, String string2, String string3) {
        return null;
    }

}

