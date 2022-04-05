package course;

import COSC2440.course.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {
    Course course1 = Course.createCourse("COSC1111", "IT", 12);
    @Test
    public void testCreateCourse() {
        assertEquals(Course.createCourse("COSC1111", "IT", 12), new Course("COSC1111", "IT", 12));
    }

    public void testTestGetName() {
        assertEquals(course1.getName(), "IT");
    }

    public void testGetId() {
        assertEquals(course1.getId(), "COSC1111");
    }

    public void testTestToString() {
        assertEquals(course1.toString(), "Course ID: COSC1111 | Course name: IT | Number of credits: 12");
    }
}