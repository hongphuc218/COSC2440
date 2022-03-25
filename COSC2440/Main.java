package COSC2440;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = in.nextLine();

        System.out.println("Enter student ID: ");
        int id =  Integer.parseInt(in.nextLine());
        
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter the date of birth: ");
        String inDate = in.nextLine().replaceAll("\\s+","");
        Date birthdate = dateformat.parse(inDate);
        
        Student stu = new Student(name, id, birthdate);
        System.out.println(stu);
    }
}

