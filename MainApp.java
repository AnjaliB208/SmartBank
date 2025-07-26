import java.util.*;
public class MainApp {

    public static void main(String[] args){
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("--Welcome to Bank App--");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account");
            System.out.println("5. Display all Accounts");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int ch;

            try{
                ch = sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid Input. Please enter a number.");
                sc.nextLine();
                continue;
            }

            switch (ch) {
                case 1:
                {
                    bank.createAccount();
                    break;
                }
                case 2:
                {
                    bank.depositMoney();
                    break;
                }
                case 3:
                {
                    bank.withdrawMoney();
                    break;
                }
                case 4:
                {
                    bank.displayAccount();
                    break;
                }
                case 5:
                {
                    bank.displayAllAccounts();
                    break;
                }
                case 6:
                {
                    System.out.println("Exiting from Bank!");
                    return;
                }
                default:
                {
                    System.out.println("Invalid Choice!");
                }
            }
        }
    }

}
