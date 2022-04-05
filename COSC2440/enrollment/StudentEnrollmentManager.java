package COSC2440.enrollment;

import java.util.List;

public interface StudentEnrollmentManager {
    public boolean add(StudentEnrollment newEnrollment);
    public boolean update(StudentEnrollment update, StudentEnrollment newUpdate);
    public void delete(StudentEnrollment deleteEnrollment);
    public boolean getOne(StudentEnrollment course);
    public List<StudentEnrollment> getAll();
}

