import java.util.Scanner;

public class ATMmachineSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        boolean repeat = true;

        while (repeat) {
            System.out.println("•Welcome to Simple ATM Machine!");
            System.out.println("•Created by Jaymark Vicente");
            System.out.println("•BSIT-1-E");
            System.out.println(" °1. Deposit");
            System.out.println(" °2. Withdraw");
            System.out.println(" °3. Balance Inquiry");
            System.out.println(" °4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Please Enter Amount to Deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Your Total Balance is: $" + balance);
                    break;

                case 2:
                    System.out.println("Your Balance is: $" + balance);
                    System.out.print("Enter Amount to Withdraw: ");
                    double amount = sc.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Please enter a valid amount greater than 0.");
                    } else if (amount <= balance) {
                        balance -= amount;
                        System.out.println("The Withdrawal is Successful! $" + amount);
                        System.out.println("Your Total Balance is: $" + balance);
                    } else {
                        System.out.println("Not Enough Balance");
                    }
                    break;

                case 3:
                    System.out.println("Your Total Balance Is: $" + balance);
                    break;

                case 4:
                    System.out.println("Thank You For Using Simple ATM Machine!");
                    repeat = false;
                    break;

                default:
                    System.out.println("Please choose between 1-4 numbers only");
            }
            System.out.println();
        }
        sc.close();
    }
}
