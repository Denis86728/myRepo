public class SavingsAccountTest {
    public static void main(String[] args) {

        //create 2 saver objects with parameters
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        //set for saver1 object the savingAccount value
        System.out.println("The new balance for saver1 is: " + saver1.getSavingsBalance()+ "$");

        //set annual interest rate for saver1 object
        SavingsAccount.modifyInterestRate(0.4);
        System.out.println("The new annual interest rate is: " + SavingsAccount.getAnnualInterestRate());
        saver1.displaySavings();
        System.out.printf("New saving balance is: %.2f$\n", saver1.getSavingsBalance());
        System.out.println(" ");

        //set the value again to 2000 for saver1 object
        saver1.setSavingsBalance(2000);
        System.out.println("The saving balance has been reset to: " + saver1.getSavingsBalance() + "$");

        // set the annual interest rate for saver1 object
        SavingsAccount.modifyInterestRate(0.5);
        System.out.println("The new annual interest rate is: " + SavingsAccount.getAnnualInterestRate());
        saver1.displaySavings();
        System.out.printf("New saving balance is: %.2f$\n", saver1.getSavingsBalance());
        System.out.println(" ");

        System.out.println("The balance for saver2 is: " + saver2.getSavingsBalance()+ "$");

        //set the annual interest rate for saver2 object
        SavingsAccount.setAnnualInterestRate(0.04);
        System.out.println("The new annual interest rate is: " + SavingsAccount.getAnnualInterestRate());
        saver2.displaySavings();
        System.out.printf("New saving balance is: %.2f$\n", saver2.getSavingsBalance());

        System.out.println(" ");

        //set again the saving balance value for saver2 object
        saver2.setSavingsBalance(3000);
        System.out.println("The saving balance has been reset to: " + saver2.getSavingsBalance() + "$");

        //set new annual interest rate for saver2 object
        SavingsAccount.setAnnualInterestRate(0.05);
        System.out.println("The new annual interest rate is: " + SavingsAccount.getAnnualInterestRate());
        saver2.displaySavings();
        System.out.printf("New saving balance is: %.2f$\n", saver2.getSavingsBalance());

        System.out.println(" ");

    }
}
