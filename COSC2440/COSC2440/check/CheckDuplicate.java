package COSC2440.check;

import COSC2440.course.Course;
import COSC2440.enrollment.StudentEnrollment;
import COSC2440.enrollment.StudentEnrollmentSystem;
import COSC2440.student.Student;

public class CheckDuplicate implements Visitor{

    @Override
    public Pair visitS(StudentEnrollmentSystem students, String studentId) {

        while (students.hasNextS()) {
            Student currentStudent = students.nextS();
            if (currentStudent.getId().equals(studentId)) {
                Pair found = new Pair(true, students.getStudents().indexOf(currentStudent));
                students.reset();
                return found;
            }
        }
        return new Pair(false, null);
    }

    @Override
    public Pair visitC(StudentEnrollmentSystem courses, String courseId) {
        while (courses.hasNextC()) {
            Course currentCourse = courses.nextC();
            if (currentCourse.getId().equals(courseId)) {
                Pair found = new Pair(true, courses.getCourses().indexOf(currentCourse));
                courses.reset();
                return found;
            }
        }
        return new Pair(false, null);
    }

    @Override
    public Pair visitE(StudentEnrollmentSystem enrollments, StudentEnrollment enrollment) {
        while (enrollments.hasNextE()) {
            StudentEnrollment e = enrollments.nextE();
            if (enrollments.getOne(e).equals(e)) {
                Pair found = new Pair(true, enrollments.getOne(e));
                enrollments.reset();
                return found;
            }
        }
        return new Pair(false, null);
    }
}
