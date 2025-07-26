public class CurrentAccount extends Account{
    public CurrentAccount(int accountNo, String holderName, double balance)
    {
        super(accountNo,holderName,balance);
    }

    @Override
    void withdraw(double amount)
    {
        if(amount <= 0){
            System.out.println("The amount for withdrawal must be positive.");
            return;
        }
        if(amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
}
