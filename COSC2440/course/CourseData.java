package COSC2440.course;

import java.util.ArrayList;
import java.util.HashSet;

public class CourseData {
    HashSet<Course> cSet = new HashSet<>();

    public boolean add(Course course) {
        return cSet.add(course);
    }

    public boolean delete(Course o) {
        return cSet.remove(o);
    }

    public boolean update(Course o, Course newO) {
        this.delete(o);
        return this.add(newO);
    }

    public <string> Course getOne(string detail) {
        for (Course s: cSet
        ) { if (detail.equals(s.getName()) | detail.equals(s.getId())){
          return s;
        }}
        return null;
    }
    
    
    public ArrayList<Course> getAll() {
       return (new ArrayList<>(cSet));
    }
}
