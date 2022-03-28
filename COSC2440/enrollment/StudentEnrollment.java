package COSC2440.enrollment;

import COSC2440.course.Course;
import COSC2440.student.Student;

public class StudentEnrollment {
    Student student;
    Course course;
    String semester;

    public StudentEnrollment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    public String getStudentID(){
        return student.getID();
    }

    public String getCourseId(){
        return  course.getID();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String toString() {
        return "student: " + student.getID() + " " + student.getName() + " | course: " + course.getID() + " " + course.getName() + " | Semester: " + semester;
    }
    
}