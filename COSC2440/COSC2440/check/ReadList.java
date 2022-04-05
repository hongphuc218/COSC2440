package COSC2440.check;

import COSC2440.course.Course;
import COSC2440.enrollment.StudentEnrollment;
import COSC2440.student.Student;

public interface ReadList {
    boolean hasNextS();

    boolean hasNextC();

    boolean hasNextE();

    Student nextS();

    Course nextC();

    StudentEnrollment nextE();

    void reset();
}
