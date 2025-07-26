import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<Account> accounts = new ArrayList();

    Scanner sc = new Scanner(System.in);

    public void addAccount(Account acc)
    {
        accounts.add(acc);
    }
    public Account findAccount(int accNo)
    {
        for(Account acc:accounts)
        {
            if(acc.getAccountNo() == accNo)
            {
                return acc;
            }
        }
        return null;
    }

    private int requestInt(String request)
    {
        while(true)
        {
            try
            {
                System.out.println(request);
                return sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid Input! Please Enter Valid Number.");
                sc.nextLine();
            }
        }
    }

    private double requestDouble(String request)
    {
        while(true)
        {
            try
            {
                System.out.println(request);
                return sc.nextDouble();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid Input! Please Enter Valid Number.");
                sc.nextLine();
            }
        }
    }


    //Menu Functions

    public void createAccount()
    {
        int accNo = requestInt("Enter Account Number: ");
        sc.nextLine();
        System.out.print("Enter Account Holder's Name: ");
        String name = sc.nextLine();
        //Ssc.nextLine();
        double bal = requestDouble("Enter Initial Balance: ");

        int accType = requestInt("Enter choice of Account Type \n1. Savings \n2. Current");
        if(accType == 1)
        {
            addAccount(new SavingsAccount(accNo,name,bal));
        }
        else
        {
            addAccount(new CurrentAccount(accNo,name,bal));
        }
        System.out.println("Account Created Successfully!");
    }

    public void depositMoney()
    {
        int accNo = requestInt("Enter Account Number: ");
        Account acc = findAccount(accNo);
        if(acc != null)
        {
            double amt = requestDouble("Enter amount to be deposited: ");
            acc.deposit(amt);
        }
        else
        {
            System.out.println("Account not found!");
        }
    }

    public void withdrawMoney()
    {
        int accNo = requestInt("Enter Account Number: ");
        Account acc = findAccount(accNo);
        if(acc != null)
        {
            double amt = requestDouble("Enter amount to be withdrawn: ");
            acc.withdraw(amt);
        }
        else
        {
            System.out.println("Account Not Found!");
        }
    }

    public void displayAccount()
    {
        int accNo = requestInt("Enter the Account Number: ");
        Account acc = findAccount(accNo);
        if(acc != null)
        {
            acc.display();
        }
        else
        {
            System.out.println("Account Not Found!");
        }
    }

    public void displayAllAccounts()
    {
        if(accounts.isEmpty())
        {
            System.out.println("No Accounts Found");
        }
        else
        {
            for (Account acc : accounts)
            {
                acc.display();
            }
        }
    }

}
