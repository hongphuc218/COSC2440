package COSC2440.course;
import java.util.ArrayList;
import java.util.List;

public class Course {    
    String id;
    String name;
    int credit;

    List<Course> courses = new ArrayList<Course>();

    public Course(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public List<Course> getCourseList() {
        return courses;
    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getCourseCredit() {
        return credit;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public static Course createCourse(String id, String name, int credit) {
        return new Course(id, name, credit);
    }
    public void getAllCourses() {
        for (Course course : courses) {
            System.out.println(course.toString());
        }
    }

    public String toString() {
        return "Course ID: " + id + " " + "| Course name: " + name + " " + "| Number of credits: " + credit;
    }
}
