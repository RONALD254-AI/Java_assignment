public class CalculateDiscount {
    static void myproject(double amount) {

        double Discount;// initialization

        if (amount > 5000) {
            Discount = amount * 0.1;// calculating 10% discount
        } else if (amount >= 1000 && amount <= 5000) {
            Discount = amount * 0.05;// calculating 5% discount
        } else {
            Discount = amount * 0.00;
        }
        System.out.println(Discount);// discount output
    }

    public static void main(String[] args) {
        myproject(7000);
        System.out.println();// calling the method
    }/*
      * Ronald Kipkosgei
      * reg no. :ct101/g/20386/23
      */
}