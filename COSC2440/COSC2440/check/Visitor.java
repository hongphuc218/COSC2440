package COSC2440.check;

import COSC2440.enrollment.StudentEnrollment;
import COSC2440.enrollment.StudentEnrollmentSystem;

public interface Visitor {
    Pair visitS(StudentEnrollmentSystem students, String studentId);
    Pair visitC(StudentEnrollmentSystem courses, String courseId);
    Pair visitE(StudentEnrollmentSystem enrollments, StudentEnrollment enrollment);
}
