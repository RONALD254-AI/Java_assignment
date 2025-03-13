import java.util.Scanner;

class StudentRecord {

     private String studentID;// Fields

    private String name;

    private String course;



public StudentRecord(String studentID, String name, String course) {// Constructor 

        this.studentID = studentID;

        this.name = name;

        this.course = course;

    }



public void displayInfo() { // Method

        System.out.println("Student ID: " + studentID);

        System.out.println("Name: " + name);

        System.out.println("Course: " + course);

    }

}

public class StudentApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter your student ID: "); // Prompt the user for student details

        String studentID = scanner.nextLine();



        System.out.print("Enter your name: ");

        String name = scanner.nextLine();



        System.out.print("Enter your course: ");

        String course = scanner.nextLine();



        StudentRecord student = new StudentRecord(studentID, name, course);  // Create a StudentRecord 



    System.out.println("\nStudent Details:");// Display 

        student.displayInfo();



        scanner.close();

    }

}