package COSC2440.Test;

import COSC2440.course.Course;
import COSC2440.enrollment.StudentEnrollment;
import COSC2440.student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestData {
    Student stu1 = Student.createStudent("S3891527", "Nguyen Hong Phuc", "13/07/2002");
    Student stu2 = Student.createStudent("S1234567", "Orvokki Azriel", "28/09/2000");
    Student stu3 = Student.createStudent("S2345678", "Dev Ida", "30/12/1999");
    Student stu4 = Student.createStudent("S3456789", "Ferdinand Ghulam", "01/01/2001");

    Course course1 = Course.createCourse("COSC2429","Introduction To Programming", 12);
    Course course2 = Course.createCourse("MATH2081","Mathematics for Computing", 12);
    Course course3 = Course.createCourse("ISYS3414","Practical Database Concepts", 12);
    Course course4 = Course.createCourse("ISYS3416","Software Engineering Fundamentals for IT", 12);

    StudentEnrollment enrollment1 = StudentEnrollment.createEnrollment(stu1, course1, "2022A");
    StudentEnrollment enrollment2 = StudentEnrollment.createEnrollment(stu2, course2, "2022A");
    StudentEnrollment enrollment3 = StudentEnrollment.createEnrollment(stu3, course3, "2022A");
    StudentEnrollment enrollment4 = StudentEnrollment.createEnrollment(stu4, course4, "2022A");
}
