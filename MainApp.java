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

            switch (ch)
            {
                case 1:


            }
        }
    }

}
