package COSC2440.enrollment;

import java.util.List;
import java.util.Objects;

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

    public static StudentEnrollment createEnrollment(Student student, Course course, String semester) {
        return new StudentEnrollment(student, course, semester);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEnrollment that = (StudentEnrollment) o;
        return Objects.equals(student, that.student) &&
                Objects.equals(course, that.course) &&
                Objects.equals(semester, that.semester);
    }

    public String getStudentId(){
        return student.getId();
    }

    public String getCourseId(){
        return  course.getId();
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
        return "student: " + student.getId() + " " + student.getName() +
                " | course: " + course.getId() + " " + course.getName() +
                " | Semester: " + semester;
    }

    

}