/*Title: Create class SavingsAccount. Use a static variable annualInterestRate to store the
annual interest rate for all account holders. Each object of the class contains a private
instance variable savingsBalance indicating the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying
the savingsBalance by annualInterestRate divided by 12,this interest should be added to
savingsBalance. Provide a static method modifyInterestRate that sets the
annualInterestRate to a new value.
Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
saver1 and saver2, with balances of Rs 2000.00 and Rs 3000.00, respectively. Set
annualInterestRate to 4%, then calculate the monthly interest and print the new balances
for both savers. Then set the annualInterestRate to 5%, calculate the next month's interest
and print the new balances for both savers. */
import java.util.*;
class SavingsAccount{
    private static double annualInterestRate ;
    public double savingsBalance;

    public SavingsAccount(double balance){
        this.savingsBalance = balance ;
       
    }
    public void getBalance(){
        System.out.println("The balance is "+this.savingsBalance);

    }

    void calculateMonthlyInterest(){
        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance += monthlyInterest;

    }

    static void modifyInterestRate(double rate){
        annualInterestRate = rate/100;
       
    }

}

public class exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter Initial balance of Saver 1 :");
        double balance1 = sc.nextDouble();

        System.out.println("Enter Initial balance of Saver 2 :");
        double balance2 = sc.nextDouble();

        SavingsAccount saver1 = new SavingsAccount(balance1);
        SavingsAccount saver2 = new SavingsAccount(balance2);
       
        System.out.println("Enter Modified interest rate [in %] :");
        double rate = sc.nextDouble();
        SavingsAccount.modifyInterestRate(rate);

        System.out.printf("Initial Balance of Saver1: %.2f%n", saver1.savingsBalance);
        System.out.printf("Initial Balance of Saver1: %.2f%n", saver2.savingsBalance);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("After 1 month Balance of Saver1: %.2f%n", saver1.savingsBalance);
        System.out.printf("After 1 month Balance of Saver1: %.2f%n", saver2.savingsBalance);

        System.out.println("Enter Modified interest rate [in %] :");
        rate = sc.nextDouble();
        SavingsAccount.modifyInterestRate(rate);

        System.out.printf("Initial Balance of Saver1: %.2f%n", saver1.savingsBalance);
        System.out.printf("Initial Balance of Saver1: %.2f%n", saver2.savingsBalance);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("After 1 month Balance of Saver1: %.2f%n", saver1.savingsBalance);
        System.out.printf("After 1 month Balance of Saver1: %.2f%n", saver2.savingsBalance);

        sc.close();
        
    }
    
}
