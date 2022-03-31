package COSC2440.ReadCSV;
import COSC2440.student.Student;
import COSC2440.course.Course;
import COSC2440.enrollment.StudentEnrollment;
import java.io.BufferedReader;
import java.io.FileReader;


public class ReadCSV {

    public static void readCSV() {
    String file = "COSC2440\\src\\default.csv";
    BufferedReader reader = null;
    String line = "";

    {
    try {
    reader = new BufferedReader(new FileReader(file));
    while((line = reader.readLine()) != null) {
    String[] values = line.split(",");

    Student student = Student.createStudent(values[0], values[1], values[2]);
    Student.add(student);

    Course course = Course.createCourse(values[3],values[4], Integer.parseInt(values[5])); 
    Course.add(course);

    StudentEnrollment se = StudentEnrollment.newStudentEnrollment(student, course, values[6]);
    StudentEnrollment.add(se);
    
    }
    }   

    catch (Exception e) {
    e.printStackTrace();
    }
    }
  }
}
