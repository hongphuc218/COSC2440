package COSC2440.check;

import COSC2440.student.Student;

public interface ReadList {
    public boolean hasNext();

    public Student next();

    public void reset();
}
