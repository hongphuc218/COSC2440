package COSC2440.course;
import java.util.ArrayList;
import java.util.List;

public class Course {    
    private String id;
    private String name;
    private int credit;

    private List<Course> courseList = new ArrayList<>();

    public Course (String id, String name, int credit) {
        this.name = name;
        this.id = id;
        this.credit = credit;
    }

    public Course () {}

    public List<Course> getCourseList() {
        return courseList;
    }
    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }

    public int getCourseCredit() {
        return credit;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void getAllCourses() {
        for (Course course : courseList) {
            System.out.println(course.toString());
        }
    }

    public String toString() {
        return "Course ID: " + id + " " + "| Course name: " + name + " " + "| Number of credits: " + credit;
    }
}
