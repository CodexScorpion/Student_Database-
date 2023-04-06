/*
Name: Joshua Lobo
PRN: 21070126127
Batch: AIML B3

OS: Mac OS 12.2.1 Monterey
java Version: 19.0.1 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
*/

//Importing Libraries

import java.util.ArrayList;
import java.util.Scanner;
public class Student {
    private String name;
    private long prn;
    private String dob;
    private int marks;

    public Student(String name, long prn, String dob, int marks) {
        this.name = name;
        this.prn = prn;
        this.dob = dob;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public long getPrn() {
        return prn;
    }

    public String getDob() {
        return dob;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrn(long prn) {
        this.prn = prn;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static void main(String[] args)
    {
        Input i = new Input();
        Operations o = new Operations();
        Display d = new Display();
        ArrayList<Student> l = new ArrayList<Student>();

        Scanner scan = new Scanner(System.in);
        int inputChoice;
        int exitChoice;


        do {
            System.out.flush();
            System.out.println("_______________________________________________________________");
            System.out.println("|This is a Menu Driven Code for Student Management System     |");
            System.out.println("|_____________________________________________________________|");
            System.out.println("|   1. Create a Database                                      |");
            System.out.println("|   2. Display the Database                                   |");
            System.out.println("|   3. Add a new Student                                      |");
            System.out.println("|   4. Search a Student                                       |");
            System.out.println("|   5. Update a Student                                       |");
            System.out.println("|   6. Delete a Student                                       |");
            System.out.println("|_____________________________________________________________|");
            System.out.print("Enter your Choice:  ");
            inputChoice = scan.nextInt();
            switch (inputChoice) {
                case 1 -> l = i.list();
                case 2 -> d.show(l);
                case 3 -> o.add(l);
                case 4 -> o.search(l);
                case 5 -> l = o.update(l);
                case 6 -> l = o.delete(l);
                default -> System.out.println("You entered wrong choice. Please repeat !!");
            }
            System.out.println("Do you want to continue ? | 1 => YES , 0 => NO");
            exitChoice = scan.nextInt();

        } while (exitChoice == 1);


    }
}