package COSC2440.ReadCSV;
import COSC2440.course.Course;
import COSC2440.enrollment.StudentEnrollment;
import COSC2440.student.Student;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

    public static List<Student> readCSVStudent(String fileName) {
      List<Student> students = new ArrayList<>();
      
      BufferedReader reader = null;
      String line = "";
      {
      try {
      reader = new BufferedReader(new FileReader(fileName));
      while((line = reader.readLine()) != null) {
      String[] values = line.split(",");

      Student student = Student.createStudent(values[0], values[1], values[2]);
      students.add(student);
    }
    }   

    catch (Exception e) {
      e.printStackTrace();
    }
    return students;
    }
  }

    public static List<Course> readCSVCourse(String fileName) {
      List<Course> courses = new ArrayList<>();
      BufferedReader reader = null;
      String line = "";
      {
      try {
      reader = new BufferedReader(new FileReader(fileName));
      while((line = reader.readLine()) != null) {
      String[] values = line.split(",");

      Course course = Course.createCourse(values[3], values[4], Integer.parseInt(values[5]));
      courses.add(course);
    }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    return courses;
    }
    }

  public static List<StudentEnrollment> readCSVEnrollment(String fileName) {
    List<Student> students = new ArrayList<>();
    List<Course> courses = new ArrayList<>();
    List<StudentEnrollment> enrollments = new ArrayList<>();
    BufferedReader reader = null;
    String line = "";
    {
      try {
        reader = new BufferedReader(new FileReader(fileName));
        while((line = reader.readLine()) != null) {
          String[] values = line.split(",");

          Student student = Student.createStudent(values[0], values[1], values[2]);
          students.add(student);

          Course course = Course.createCourse(values[3], values[4], Integer.parseInt(values[5]));
          courses.add(course);

          StudentEnrollment enrollment = StudentEnrollment.createEnrollment((Student) students, (Course) courses, values[6]);
          enrollments.add(enrollment);
        }
      }
      catch (Exception e) {
        e.printStackTrace();
      }
      return enrollments;
    }
  }
  }
