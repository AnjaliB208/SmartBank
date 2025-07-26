import java.util.*;
abstract class Account {
    protected int accountNo;
    protected String holderName;
    protected double balance;

    Account(int accountNo, String holderName, double balance)
    {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited amount: "+amount);
    }
    abstract void withdraw(double amount);

    void display()
    {
        System.out.println("Account No. : "+accountNo+ "\nAccount Holder's Name: " + holderName + "\nBalance : "+ balance);
    }

    public int getAccountNo() {
        return accountNo;
    }
}
