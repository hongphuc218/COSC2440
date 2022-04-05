package COSC2440.enrollment;

import java.util.List;

import COSC2440.ReadCSV.ReadCSV;
import COSC2440.check.Pair;
import COSC2440.check.ReadList;
import COSC2440.check.Visitor;
import COSC2440.check.Visitor1;
import COSC2440.course.Course;
import COSC2440.student.Student;

public class StudentEnrollmentSystem implements StudentEnrollmentManager, ReadList, Visitor1 {

    static List<Student> students = ReadCSV.readCSVStudent("COSC2440\\src\\default.csv");

    public static List<Course> courses = ReadCSV.readCSVCourse("COSC2440\\src\\default.csv");

    public static List<StudentEnrollment> enrollments = ReadCSV.readCSVEnrollment("COSC2440\\src\\default.csv");
    
    int currentItem = 0;
    Student compareS;
    Course compareC;
    StudentEnrollment compareE;

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
    public StudentEnrollment getOne(StudentEnrollment enrollment) {
        return enrollment;
    }

    public void getAllCourses() {
        for (Course course : courses) {
            System.out.println(course.toString());
        }
    }

    public static StudentEnrollmentSystem getInstance() {
        return instance;
    }

    public void compareEnrollment(StudentEnrollment compare) {this.compareE = compare;}
    public void compareStudent(Student compare) {this.compareS = compare;}
    public void compareCourse(Course compare) {this.compareC = compare;}


    @Override
    public boolean hasNextS() {
        if (currentItem >= students.size()) {
            reset();
            return false;
        }
        return true;
    }

    @Override
    public boolean hasNextC() {
        if (currentItem >= courses.size()) {
            reset();
            return false;
        }
        return true;
    }

    @Override
    public boolean hasNextE() {
        if (currentItem >= courses.size()) {
            reset();
            return false;
        }
        return true;
    }

    @Override
    public Student nextS() {
        return students.get(currentItem++);
    }

    @Override
    public Course nextC() {
        return courses.get(currentItem++);
    }

    @Override
    public StudentEnrollment nextE() {return enrollments.get(currentItem++);
    }

    @Override
    public void reset() {
        currentItem = 0;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public Pair visitorS(Visitor visitor) {
        return visitor.visitS((StudentEnrollmentSystem) students, String.valueOf(compareS));
    }

    @Override
    public Pair visitorC(Visitor visitor) {
        return visitor.visitC((StudentEnrollmentSystem) courses, String.valueOf(compareC));
    }

    @Override
    public Pair visitorE(Visitor visitor) {
        return visitor.visitE((StudentEnrollmentSystem) enrollments, compareE);
    }
}
