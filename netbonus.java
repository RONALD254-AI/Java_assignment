import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int time = 24;//24hrs clock system initialization
        if (time < 12) {
            System.out.println("Good morning!. let's run this code now");//time
        } else if (time >= 12) {
            System.out.println("Good Day!. let's run this code now");//time
        }  else {
            System.out.println("Time Error but let's run this code first");//time
        }//This is the code to show what time are you running your code

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your salary: ");//the user required to enter the salary amount
        double Salary= scanner.nextDouble();

        System.out.println("Enter the year of service:");//request the user to enter the number of years
        double years = scanner.nextDouble();

        double bonus;
        if(years > 10 ){
            bonus=0.12* Salary;//receiving 12% of the salary
        }else if(years >=6 & years <=10){
            bonus=0.01*Salary;//receiving 10% of the salary
        }
        else{
            bonus=0.08*Salary;//receiving 8% of the salary
        }
        System.out.println("Your Net bonus Amount is: "+ (Salary+bonus));//this is the total output
    }
}
