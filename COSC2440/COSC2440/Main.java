package COSC2440;

import COSC2440.course.Course;
import COSC2440.enrollment.StudentEnrollment;
import COSC2440.enrollment.StudentEnrollmentSystem;
import COSC2440.student.Student;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        StudentEnrollmentSystem ses = new StudentEnrollmentSystem();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Student Enrollment System! \n" +
                            "Enter your Name: ");
        String name1 = sc.nextLine();
        System.out.println("Enter your ID: ");
        String id1 = sc.nextLine();
        System.out.println("Enter your Birthdate: ");
        String birthdate1 = sc.nextLine();
        Student student1 = new Student(name1, id1, birthdate1);
        System.out.println(student1);

        System.out.println("Choose your option to continue: \n" +
                            "1. Create a new enrollment \n" +
                            "2. Update an enrollment \n" +
                            "3. Delete an enrollment \n" +
                            "4. Show all available courses \n" +
                            "5. Print all courses available \n" +
                            "6. Print all students of 1 courses");
        
        
        
        String input = sc.nextLine();
        switch (input) {
            case "1":
            System.out.println("Create a new enrollment");
            System.out.println("Enter Course name you want to enroll: ");
            String cname1 = sc.nextLine();
            System.out.println("Enter course ID: ");
            String cid1 = sc.nextLine();
            System.out.println("Enter semester you want to enroll in: ");
            String sem1 = sc.nextLine();
            System.out.println("Enter number of credit:");
            int cre1 = sc.nextInt();
            Course course1 = new Course(cname1, cid1, cre1);
            System.out.println(course1);
            StudentEnrollment enrollment1 = new StudentEnrollment(student1, course1, sem1);

            if (StudentEnrollmentSystem.enrollments.contains(enrollment1)) {
                System.out.println("This enrollment already existed");
            }
            else System.out.println("Enrollment successfully: " + enrollment1);
            StudentEnrollmentSystem.enrollments.add(enrollment1);

            case "2":
            System.out.println("Update an enrollment");
            System.out.println();

            case "3":
            System.out.println("Delete an enrollment");
            System.out.println("Enter a Course you want to erase");
            String delCourse = sc.nextLine();

            case "4":
            System.out.println(StudentEnrollmentSystem.courses.toString());
            case "5":

        }

    }

    
}

