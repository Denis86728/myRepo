public class SavingsAccount {
    private static double annualInterestRate;

    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        setAnnualInterestRate(annualInterestRate);
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {
        return savingsBalance * annualInterestRate / 12;
    }

    public void displaySavings() {
        double monthlyInterest = calculateMonthlyInterest();
        savingsBalance = monthlyInterest + savingsBalance;
    }

}
