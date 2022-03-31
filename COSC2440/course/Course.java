package COSC2440.course;

import java.util.HashSet;

import COSC2440.ReadCSV.PrintOut;

public class Course implements PrintOut{    
    String id;
    String name;
    int credit;

    public Course(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    static HashSet<Course> cSet = new HashSet<>();
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getCourseCredit() {
        return credit;
    }

    public static boolean add(Course course) {
        return cSet.add(course);
    }

    public boolean delete(Course o) {
        return cSet.remove(o);
    }

    public boolean update(Course o, Course newO) {
        this.delete(o);
        return Course.add(newO);
    }

    public HashSet<Course> getCourseList() {
        return cSet;
    }

    public <string> Course getOne(string detail) {
        for (Course c: cSet
        ) { if (detail.equals(c.getName()) | detail.equals(c.getId())){
          return c;
        }}
        return null;
    }
    
    public HashSet<Course> getAll() {
       return (new HashSet<>(cSet));
    }

    public static Course createCourse(String id, String name, int credit) {
        return new Course(id, name, credit);
    }

    public String toString() {
        return "Course ID: " + id + " " + "| Course name: " + name + " " + "| Number of credits: " + credit;
    }

    public String[] toPrint() {
        return new String[] {this.id, this.name, String.valueOf(this.credit)};
    }
}
