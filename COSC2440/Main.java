package COSC2440;

import java.util.Scanner;
import COSC2440.student.Student;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student stu = new Student();

        System.out.println("Welcome to the Student Enrollment System! \n" +
                            "Enter Student ID: \n");
        String stuId = sc.nextLine();

        System.out.println("Choose your option to continue: \n" +
                            "1. Make a new enrollment \n" +
                            "2. Update an enrollment \n" +
                            "3. Delete an enrollment \n" +
                            "4. Show all available courses \n");                   
        
        
        
        String input = sc.nextLine();
        switch (input) {
            case "1":
            
        }

    }

    
}

