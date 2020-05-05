import java.util.Arrays;
import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {

        //create 2 saver objects without parameters
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        //set for saver1 object the savingAccount value
        saver1.setSavingsBalance(2000);
        System.out.println("The new balance for saver1 is: " + saver1.getSavingsBalance()+ "$");

        //set annual interest rate for saver1 object
        SavingsAccount.setAnnualInterestRate(0.04);
        System.out.println("The new annual interest rate is: " + SavingsAccount.getAnnualInterestRate());
        saver1.displaySavings();
        System.out.printf("Monthly interest rate is: %.2f$\n", saver1.getMonthlyInterest());
        System.out.printf("New saving balance is: %.2f$\n", saver1.getSavingsBalance());
        System.out.println(" ");

        //set the value again to 2000 for saver1 object
        saver1.setSavingsBalance(2000);
        System.out.println("The saving balance has been reset to: " + saver1.getSavingsBalance() + "$");

        // set the annual interest rate for saver1 object
        SavingsAccount.setAnnualInterestRate(0.05);
        System.out.println("The new annual interest rate is: " + SavingsAccount.getAnnualInterestRate());
        saver1.displaySavings();
        System.out.printf("Monthly interest rate is: %.2f$\n", saver1.getMonthlyInterest());
        System.out.printf("New saving balance is: %.2f$\n", saver1.getSavingsBalance());
        System.out.println(" ");

        //set the savingBalance value for saver2 object
        saver2.setSavingsBalance(3000);
        System.out.println("The new balance for saver1 is: " + saver2.getSavingsBalance()+ "$");

        //set the annual interest rate for saver2 object
        SavingsAccount.setAnnualInterestRate(0.04);
        System.out.println("The new annual interest rate is: " + SavingsAccount.getAnnualInterestRate());
        saver2.displaySavings();
        System.out.printf("Monthly interest rate is: %.2f$\n", saver2.getMonthlyInterest());
        System.out.printf("New saving balance is: %.2f$\n", saver2.getSavingsBalance());


        System.out.println(" ");

        //set again the saving balance value for saver2 object
        saver2.setSavingsBalance(3000);
        System.out.println("The saving balance has been reset to: " + saver2.getSavingsBalance() + "$");

        //set new annual interest rate for saver2 object
        SavingsAccount.setAnnualInterestRate(0.05);
        System.out.println("The new annual interest rate is: " + SavingsAccount.getAnnualInterestRate());
        saver2.displaySavings();
        System.out.printf("Monthly interest rate is: %.2f$\n", saver2.getMonthlyInterest());
        System.out.printf("New saving balance is: %.2f$\n", saver2.getSavingsBalance());

        System.out.println(" ");

    }
}
