package COSC2440;
import java.util.List;

public class StudentEnrollment {
    Student student;
    Course course;
    String semester;

    private List<Student>students;
    private List<Course>courses;
    
    public void StudentEnrollment (List<Student> students, List<Course> courses) {
        this.students = students;
        this.courses = courses;
    }
}