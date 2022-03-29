package COSC2440.enrollment;

import COSC2440.course.Course;
import COSC2440.student.Student;


public class StudentEnrollment implements StudentEnrollmentManager{
    Student student;
    Course course;
    String semester;

    public StudentEnrollment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
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

    public static String setSemester(String semester) {
        return semester;
    }

    public static StudentEnrollment newStudentEnrollment(Student student, Course course, String semester){
        return new StudentEnrollment(student, course,semester);
      }

    public String toString() {
        return "student: " + student.getId() + " " + student.getName() + " | course: " + course.getId() + " " + course.getName() + " | Semester: " + semester;
    }
    
    public String[] toPrint() {
        return new String[]{this.student.getId(), this.course.getId(), this.semester};
    }

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public boolean update() {
        return false;
    }
}