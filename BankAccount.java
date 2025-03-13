public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance= initialBalance;
    }
    public void deposit(double amount){
        if(amount >0){
            balance +=amount;
        }
        else{
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<= balance){
            balance= amount;
        }
        else{
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[]args){
        BankAccount myAccount= new BankAccount(1000);
        System.out.println("Initial balance: "+ myAccount.getBalance());//Accessing balance through getter

        myAccount.deposit(500);
        System.out.println("Balance after deposit: " + myAccount.getBalance());

        myAccount.withdraw(200);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());

        myAccount.withdraw(2000);
        System.out.println("Balance after attempted overdraft: " + myAccount.getBalance());
    }
}