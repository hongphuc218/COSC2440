package COSC2440;

public class Course {
    String name;
    int id;
    int credit;
    public Course (String name, int id, int credit) {
        this.name = name;
        this.id = id;
        this.credit = credit;
    }

    public String getCourseName() {
        return name;
    }

    public int getCourseID() {
        return id;
    }

    public int getCourseCredit() {
        return credit;
    }
}
