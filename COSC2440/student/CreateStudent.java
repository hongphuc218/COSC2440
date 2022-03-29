package COSC2440.student;

public class CreateStudent {

    Student student = new Student();

    public CreateStudent addId(String id){
        student.setId(id);
        return this;
    }

    public CreateStudent addName(String name){
        student.setName(name);
        return this;
    }

    public CreateStudent addBirthdate(String birthdate){
        student.setBirthdate(birthdate);
        return this;
    }

    public Student createStudent(){
        return student;
    }
}