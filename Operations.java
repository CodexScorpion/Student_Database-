//Importing Libraries 
import java.util.ArrayList;
import java.util.Scanner;
public class Operations {
    //Creating instance of Input class
    Input i = new Input();
    //Scanner Class for User Input
    Scanner sc = new Scanner(System.in);


    //Adding a new Student

    ArrayList<Student> add(ArrayList<Student> Students) {
        System.out.println("Here you can add a new student");
        long prn;
        String name;
        String dob;
        int marks;

        System.out.print("Name of Student: ");
        name = sc.nextLine();
        System.out.print("PRN of Student: ");
        prn = sc.nextLong();
        System.out.print("DOB of Student: ");
        dob = sc.nextLine();
        System.out.print("Marks of Student: ");
        marks = sc.nextInt();

        Student student = new Student(name, prn, dob, marks);
        Students.add(student);
        System.out.println("Student added successfully!");
        return Students;
    }

    //Searching a Student
    public void search(ArrayList<Student> Students) {
        long prn;
        String name;

        System.out.print("Name: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.print("PRN: ");
        prn = sc.nextLong();

        boolean found = false;

        for (Student student : Students) {
            if (student.getName().equalsIgnoreCase(name) || student.getPrn() == prn) {
                System.out.println("Student Found");
                System.out.println("-----------------");
                System.out.println("Name: " + student.getName());
                System.out.println("PRN: " + student.getPrn());
                System.out.println("DOB: " + student.getDob());
                System.out.println("Marks: " + student.getMarks());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No student found with PRN " + prn + " and name " + name);
        }
    }

    //Updating
    ArrayList<Student> update(ArrayList<Student> Students) {
        int choice;
        Display d = new Display();
        long prn;
        System.out.println("Enter the PRN to update => ");
        prn = sc.nextLong();
        int flag = 0;
        for (Student student : Students) {


            if (student.getPrn() == prn) {
                System.out.println("Student Found !!!!!!");
                System.out.println("----------------------");
                d.showSingleStudent(student);
                System.out.println("Select Field to Update ");
                System.out.println("--------------------------------");
                System.out.println("1. Name ");
                System.out.println("2. PRN ");
                System.out.println("3. DOB ");
                System.out.println("4. Marks ");
                System.out.println("-------------------------------");
                System.out.print("Enter Choice: ");
                choice = sc.nextInt();
                if (choice == 1) {
                    String name;
                    System.out.print("Enter New Name: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    student.setName(name);
                } else if (choice == 2) {
                    long prn2;
                    System.out.print("Enter New PRN: ");
                    prn2 = sc.nextLong();
                    student.setPrn(prn2);

                } else if (choice == 3) {
                    String dob;
                    System.out.print("Enter New DOB: ");
                    sc.nextLine();
                    dob = sc.nextLine();
                    student.setDob(dob);
                } else if (choice == 4) {
                    int marks;
                    System.out.print("Enter New Marks: ");
                    marks = sc.nextInt();
                    student.setMarks(marks);
                } else {
                    System.out.println("Error in choice!!!!1");
                }

                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Student Not found");
        }

        return Students;
    }

    //Deleting a Student

    ArrayList<Student> delete(ArrayList<Student> Students) {

        Display display = new Display();
        int choice;
        long prn;
        boolean flag = false;

        System.out.print("Enter PRN of Student to remove: ");
        prn = sc.nextLong();

        for (Student student : Students) {
            if (student.getPrn() == prn) {
                display.showSingleStudent(student);
                System.out.print("Do you confirm the changes? (1 -> YES / 0 -> NO): ");
                choice = sc.nextInt();
                if (choice == 1) {
                    Students.remove(student);
                } else {
                    break;
                }
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("No student found with PRN " + prn);
        }
        return Students;
    }

}
