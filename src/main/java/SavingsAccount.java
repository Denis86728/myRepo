public class SavingsAccount {

    private static double annualInterestRate;

    private double savingsBalance;

    private double monthlyInterest;

    public SavingsAccount() {

    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getMonthlyInterest() {
        return monthlyInterest;
    }

    public void setMonthlyInterest(double monthlyInterest) {
        this.monthlyInterest = monthlyInterest;
    }

    public void calculateMonthlyInterest() {
        this.monthlyInterest = (savingsBalance * annualInterestRate) / 12;
    }

    public void displaySavings(){
        calculateMonthlyInterest();
        savingsBalance = this.monthlyInterest + savingsBalance;
    }

    public static void modifyInterestRate(){
        setAnnualInterestRate(annualInterestRate);
    }

}
