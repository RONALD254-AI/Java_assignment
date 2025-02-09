import java.util.Scanner;

class Employee {// Employee Class
    private String name;
    private double salary;

     public Employee(String name, double salary) {// Constructor
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() { // Method to display details
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: ksh." + salary);
    }
}

class SalaryCalculator {
    // Method to calculate bonus (10% of salary)
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

public class MainApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, salary);

        // Creating SalaryCalculator object
        SalaryCalculator calculator = new SalaryCalculator();
        double bonus = calculator.calculateBonus(employee.getSalary());

        // Displaying details
        employee.displayDetails();
        System.out.println("Bonus: ksh." + bonus);

        scanner.close();
    }
}/*Ronald Kipkosgei    REG: CT101/G/20386/23  */