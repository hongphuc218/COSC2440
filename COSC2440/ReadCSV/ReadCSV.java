package COSC2440.ReadCSV;
import COSC2440.student.Student;
import COSC2440.student.StudentData;
import COSC2440.course.Course;
import COSC2440.course.CourseData;
import COSC2440.enrollment.EnrollmentData;
import COSC2440.enrollment.StudentEnrollment;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import org.omg.CORBA.portable.InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCSV {

    public static Object[] getCSV(String fileName) throws IOException, NumberFormatException, CsvValidationException {
        System.out.println("Began importing student enrolment data");
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        EnrollmentData studentEnrollmentData = new EnrollmentData();
        StudentData studentData = new StudentData();
        CourseData courseData = new CourseData();
        try (InputStream is = (InputStream) classloader.getResourceAsStream(fileName)) {
          assert is != null;
          BufferedReader data = new BufferedReader(new InputStreamReader(is));
          CSVReader reader = new CSVReader(data);
          String[] row;
          while ((row = reader.readNext())!=null){
            Student s = Student.createStudent(row[0], row[1],row[2]);
            Course c = Course.createCourse(row[3], row[4],Integer.parseInt(row[5]));
            StudentEnrollment se = StudentEnrollment.newStudentEnrollment(s, c,row[6]);
            if (!studentData.add(s)){
              System.out.println("Student data already existed");
            }
            if (!courseData.add(c)){
              System.out.println("Course data already existed");
            }
            studentEnrollmentData.add(se);
    
          }
        }catch (Exception e) {

        }
        return new Object[]{studentData,courseData,studentEnrollmentData};
      }
    // public static List<Student> students = new ArrayList<>();
    // public static List<Course> courses = new ArrayList<>();
    // public static List<StudentEnrollment> enrollments = new ArrayList<>();
    // String file = "COSC2440\\src\\default.csv";
    // BufferedReader reader = null;
    // String line = "";

    

    // {
    // try {
    // reader = new BufferedReader(new FileReader(file));
    // while((line = reader.readLine()) != null) {
    // String[] values = line.split(",");

    // Student student = Student.createStudent(values[0], values[1], values[2]);
    // students.add(student);

    // Course course = Course.createCourse(values[3],values[4], Integer.parseInt(values[5])); 
    // courses.add(course);

    // StudentEnrollment se = StudentEnrollment.newStudentEnrolment(student, course, values[6]);
    // enrollments.add(se);
    // }
    // }   

    // catch (Exception e) {
    // e.printStackTrace();
    // }
    // }
    
    // public static List<Student> getsList() {
    //     return students;
    // }

    // public static List<Course> getcList() {
    //     return courses;
    // }

    // public static List<StudentEnrollment> getseList() {
    //     return enrollments;
    // }

}
