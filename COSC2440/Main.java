package COSC2440;
import COSC2440.student.CreateStudent;
import COSC2440.student.Student;
import COSC2440.course.Course;
import COSC2440.enrollment.StudentEnrollment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<StudentEnrollment> enrollments = new ArrayList<>();
        String file = "COSC2440\\src\\default.csv";
        BufferedReader reader = null;
        String line = "";
        try {
        reader = new BufferedReader(new FileReader(file));
        while((line = reader.readLine()) != null) {
         
        String[] values = line.split(",");
        CreateStudent createStudent = new CreateStudent();
        Student student = createStudent.addId(values[0]).addName(values[1]).addBirthdate(values[2]).createStudent();
        students.add(student);

        Course course = Course.createCourse(values[3],values[4], Integer.parseInt(values[5])); 
        courses.add(course);

        StudentEnrollment se = StudentEnrollment.newStudentEnrolment(student, course, values[6]);
        enrollments.add(se);
        }
        }   

        catch (Exception e) {
        e.printStackTrace();
        }
              
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student ID: ");
        String id =  in.nextLine();
        
        System.out.println("Enter a semester to enroll: ");
        String sem = in.nextLine();
        
        
    }

    
}

