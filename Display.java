//Importing Libraries
import java.util.*;


public class Display {
    public void show(ArrayList<Student> students) {
        System.out.println("The Number of Students are: " + students.size());
        System.out.println("--------------------------------");

        for (Student student : students) {
            System.out.println("Details for " + student.getName());
            System.out.println("----------------------------------");
            System.out.println("Name: " + student.getName());
            System.out.println("PRN: " + student.getPrn());
            System.out.println("DOB: " + student.getDob());
            System.out.println("Marks: " + student.getMarks());
            System.out.println("----------------------------------");
        }
    }


    public void showSingleStudent(Student student) {
        System.out.println("Details of student");
        System.out.println("**************************");
        System.out.println("Name: " + student.getName());
        System.out.println("PRN: " + student.getPrn());
        System.out.println("DOB: " + student.getDob());
        System.out.println("Marks: " + student.getMarks());
    }
}