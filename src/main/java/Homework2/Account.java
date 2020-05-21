package Homework2;

public class Account {
    private double balance;

    public Account(double initialBalance){
        if(initialBalance > 0.0){
            balance = initialBalance;
        }
    }

    public void credit(double amountCredit){
        balance = balance + amountCredit;
    }

    public double getBalance(){
        return balance;
    }

    public void debit(double amountDebit){
        if(balance >= amountDebit){
            balance = balance - amountDebit;
        }
        else{
            System.out.printf("Debit amount exceeded account balance which is %d", balance);
        }
    }
}
