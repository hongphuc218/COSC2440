package COSC2440.enrollment;

import java.util.List;

public interface StudentEnrollmentManager {
    boolean add(StudentEnrollment newEnrollment);
    boolean update(StudentEnrollment update, StudentEnrollment newUpdate);
    void delete(StudentEnrollment deleteEnrollment);
    StudentEnrollment getOne(StudentEnrollment course);
    List<StudentEnrollment> getAll();
}

