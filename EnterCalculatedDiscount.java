import java.util.Scanner;

public class EnterCalculatedDiscount {
    public static double CalcuateDiscount(double SalesAmount) {// initializing

        double discount = 0;

        if (SalesAmount > 50000) {// 10% for amount more than 5000
            discount = SalesAmount * 0.1;
        } else if (SalesAmount >= 1000) {// 5% discount for amount less than 5000 & more than 1000
            discount = SalesAmount * 0.05;
        }
        return discount;// return the output
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sale Amount: ");
        double SalesAmount = scanner.nextDouble();
        double discount = CalcuateDiscount(SalesAmount);
        System.out.println("Discount: " + discount);// show the output
        System.out.println("Final Price: " + (SalesAmount - discount));// output the final price

        scanner.close();/*
                         * Ronald Kipkosgei
                         * Reg No. CT101/G/20386/23
                         * OOPII
                         */
    }
}
