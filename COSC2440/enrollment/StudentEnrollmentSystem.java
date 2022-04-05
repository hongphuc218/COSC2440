package COSC2440.enrollment;

import java.util.List;

import COSC2440.ReadCSV.ReadCSV;
import COSC2440.course.Course;
import COSC2440.student.Student;

public class StudentEnrollmentSystem implements StudentEnrollmentManager{

    static List<Student> students = ReadCSV.readCSVStudent("COSC2440\\src\\default.csv");

    static List<Course> courses = ReadCSV.readCSVCourse("COSC2440\\src\\default.csv");

    public static List<StudentEnrollment> enrollments = ReadCSV.readCSVEnrollment("COSC2440\\src\\default.csv");

    StudentEnrollment compare;

    static StudentEnrollmentSystem instance = new StudentEnrollmentSystem();

    @Override
    public boolean add(StudentEnrollment newEnrollment) {
        return StudentEnrollmentSystem.enrollments.add(newEnrollment);
    }

    @Override
    public void delete(StudentEnrollment enrollment) {
        StudentEnrollmentSystem.enrollments.remove(enrollment);

    }
    @Override
    public boolean update(StudentEnrollment update, StudentEnrollment newUpdate) {
        this.delete(update);
        return this.add(newUpdate);
    }
    
    @Override
    public List<StudentEnrollment> getAll() {
        return StudentEnrollmentSystem.enrollments;
    }

    @Override
    public boolean getOne(StudentEnrollment enrollment) {
        return false;
    }

    public void getAllCourses() {
        for (Course course : courses) {
            System.out.println(course.toString());
        }
    }

    public static StudentEnrollmentSystem getInstance() {
        return instance;
    }

    public void setToBeCompared(StudentEnrollment compare) {
        this.compare = compare;
    }
}
