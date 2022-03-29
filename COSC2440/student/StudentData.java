package COSC2440.student;

import java.util.ArrayList;
import java.util.HashSet;


public class StudentData {
    HashSet<Student> sSet = new HashSet<>();

    public boolean add(Student student) {
        return this.sSet.add(student);
    }

    public boolean delete(Student o) {
        return this.sSet.remove(o);
    }

    public boolean update(Student o, Student newO) {
        this.delete(o);
        return this.add(newO);
    }

    public <string> Student getOne(string detail) {
        for (Student s: this.sSet
        ) { if (detail.equals(s.getName()) | detail.equals(s.getId())){
          return s;
        }}
        return null;
    }
    
    
    public ArrayList<Student> getAll() {
       return (new ArrayList<>(sSet));
    }
}
