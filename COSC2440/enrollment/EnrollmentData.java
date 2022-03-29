package COSC2440.enrollment;

import java.util.HashSet;

public class EnrollmentData {
    HashSet<StudentEnrollment> eSet = new HashSet<>();

    public boolean add(StudentEnrollment student) {
        return this.eSet.add(student);
    }

    public boolean delete(StudentEnrollment o) {
        return this.eSet.remove(o);
    }

    public boolean update(StudentEnrollment o, StudentEnrollment newO) {
        this.delete(o);
        return this.add(newO);
    }

    
}
