import java.util.Scanner;

// Student class
class Student {
    private String name;
    private double marks;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class GradeCalculator {// GradeCalculator class
    // Method to calculate grade
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

public class MainApp {// Main application class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");// Getting user input
        String name = scanner.nextLine();

        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(name, marks);

        // Creating GradeCalculator object
        GradeCalculator gradeCalculator = new GradeCalculator();

        String grade = gradeCalculator.calculateGrade(student.getMarks()); // Calculating grade

        student.displayDetails();
        System.out.println("Grade: " + grade);

        scanner.close();,
    }
}
