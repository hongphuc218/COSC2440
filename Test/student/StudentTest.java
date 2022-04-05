package student;

import COSC2440.student.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    Student stu1 = Student.createStudent("S12345", "John", "11/11/2001");
    @Test
    public void testCreateStudent() {
        assertEquals(Student.createStudent("S3891527", "Phuc", "13/07/2002"), new Student("S3891527", "Phuc", "13/07/2002"));
    }

    public void testGetName() {
        assertEquals(stu1.getName(), "John");
    }

    public void testGetId() {
        assertEquals(stu1.getId(), "S12345");
    }

    public void testToString() {
        assertEquals(stu1.toString(), "Student ID: S12345 | Student name: John | Birthdate: 11/11/2011");
    }
}