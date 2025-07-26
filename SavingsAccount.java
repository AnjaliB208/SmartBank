public class SavingsAccount extends Account{
    private static final double MIN_BALANCE = 500.0;
    SavingsAccount(int accountNo, String holderName, double balance)
    {
        super(accountNo,holderName,balance);
    }
    @Override
    void withdraw(double amount) {
        if(balance <= 0)
        {
            System.out.println("The withdrawal amount should always be positive.");
            return;
        }

        if(balance - amount >= MIN_BALANCE)
        {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
        }
        else{
            System.out.println("Can't Withdraw! Minimum balance of " + MIN_BALANCE + " must be maintained.");
        }
    }
}
