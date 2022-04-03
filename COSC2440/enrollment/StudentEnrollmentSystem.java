package COSC2440.enrollment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import COSC2440.ReadCSV.ReadCSV;
import COSC2440.course.Course;
import COSC2440.student.Student;

public class StudentEnrollmentSystem implements StudentEnrollmentManager{

    List<Student> students = ReadCSV.readCSVStudent("COSC2440\\src\\default.csv");

    List<Course> courses = ReadCSV.readCSVCourse("COSC2440\\src\\default.csv");

    List<StudentEnrollment> enrollments = new ArrayList<>();



    public String getInput(){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            return sc.next();
        }   else return null;
    }

    @Override
    public boolean add(StudentEnrollment newEnrollment) {
        return this.enrollments.add(newEnrollment);
    }

    @Override
    public boolean delete(StudentEnrollment enrollment) {
        return this.enrollments.remove(enrollment);

    }
    @Override
    public boolean update(StudentEnrollment update, StudentEnrollment newUpdate) {
        this.delete(update);
        return this.add(newUpdate);
    }
    
    @Override
    public List<StudentEnrollment> getAll() {
        return this.enrollments;
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
 
}
