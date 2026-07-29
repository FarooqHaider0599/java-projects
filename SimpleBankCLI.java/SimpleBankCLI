/**
 * @file    SimpleBankCLI.java
 * @author  Muhammad Farooq Haider
 * @brief   Console-based banking simulator supporting balance inquiry,
 *          deposits, and withdrawals through an interactive menu.
 *
 * @details Demonstrates Java switch expressions (arrow syntax), input
 *          validation for monetary transactions, and basic state
 *          management using a loop-driven CLI menu. Balance is tracked
 *          in-memory for the duration of the session.
 */
import java.util.Scanner;

public class SimpleBankCLI {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isRunning = true;
        double balance = 0;

        while (isRunning) {
            System.out.println("*********************");
            System.out.println("----Bank Program-----");
            System.out.println("*********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*********************");
            System.out.println("Enter your Choice: (1-4)");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.printf("Current Balance: $%.2f%n", showBalance(balance));

                case 2 -> {
                    double deposit = getDepositAmount();
                    if (deposit <= 0) {
                        System.out.println("Deposit can't be negative or zero");
                    } else {
                        balance = balance + deposit;
                        System.out.printf("Deposit successful. New Balance: $%.2f%n", balance);
                    }
                }

                case 3 -> {
                    double amount = getWithdrawAmount();
                    if (amount > balance) {
                        System.out.println("Insufficient Balance");
                    } else if (amount <= 0) {
                        System.out.println("Withdrawal amount can't be zero or negative");
                    } else {
                        balance = balance - amount;
                        System.out.printf("Withdrawal successful. New Balance: $%.2f%n", balance);
                    }
                }

                case 4 -> isRunning = false;

                default -> System.out.println("Invalid Choice!");
            }
        }

        System.out.println("Thank You! Have a nice day!");
    }

    static double showBalance(double balance) {
        return balance;
    }

    static double getDepositAmount() {
        System.out.println("Enter the amount of money to deposit: ");
        return scanner.nextDouble();
    }

    static double getWithdrawAmount() {
        System.out.println("Enter the amount of money to withdraw: ");
        return scanner.nextDouble();
    }
}
