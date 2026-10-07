import java.util.Scanner;

import java.util.Scanner;

class Account {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " rs");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " rs");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class EncapsulationBankingAppPj {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Enter your name: ");
        account.setAccountHolder(input.nextLine());

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    account.deposit(input.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(input.nextDouble());
                    break;

                case 3:
                    System.out.println("Current Balance: " +
                            account.getBalance() + " rs");
                    break;

                case 4:
                    System.out.println("Thank you for using the banking app!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        input.close();
    }
}