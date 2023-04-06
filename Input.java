//Importing Libraries
import java.util.ArrayList;
import java.util.Scanner;
public class Input {
        //Scanner Class to take User Input
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list() {
        ArrayList<Student> Students = new ArrayList<Student>();

        System.out.print("Enter Number of Students: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("For student " + (i+1) + ":");
            System.out.println("---------------------");

            System.out.print("Name: ");
            scanner.nextLine(); //Newline character
            String name = scanner.nextLine();

            System.out.print("PRN: ");
            long prn = scanner.nextLong();

            System.out.print("Date of Birth: ");
            scanner.nextLine(); // Newline character
            String dob = scanner.nextLine();

            System.out.print("Marks: ");
            int marks = scanner.nextInt();

            Student student = new Student(name, prn, dob, marks);
            Students.add(student);
        }

        return Students;
    }

}