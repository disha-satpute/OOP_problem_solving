import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private String depositorAddress;
    private String accountType;
    private double balance;
    private int transactions;
    private String accountNumber;

    private static int accountCounter = 1000;

    public BankAccount(String name, String address, String type, double initialBalance) {
        this.depositorName = name;
        this.depositorAddress = address;
        this.accountType = type;
        this.balance = initialBalance;
        this.transactions = 0;
        this.accountNumber = "BA" + accountCounter++;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Depositor Address: " + depositorAddress);
        System.out.println("Account Type: " + accountType);
        System.out.printf("Balance: %.2f\n", balance);
        System.out.println("Number of Transactions: " + transactions);
        System.out.println();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions++;
            System.out.printf("Successfully deposited %.2f. New balance: %.2f\n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions++;
            System.out.printf("Successfully withdrew %.2f. New balance: %.2f\n", amount, balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void changeAddress(String newAddress) {
        this.depositorAddress = newAddress;
        System.out.println("Address changed successfully to: " + newAddress);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getTransactions() {
        return transactions;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        int numberOfDepositors;

        System.out.print("Enter the number of depositors: ");
        numberOfDepositors = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfDepositors; i++) {
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter Account Type: ");
            String type = scanner.nextLine();
            System.out.print("Enter Initial Balance: ");
            double initialBalance = scanner.nextDouble();
            scanner.nextLine(); 
            accounts.add(new BankAccount(name, address, type, initialBalance));
        }
        System.out.print("Enter account number to display information: ");
        String accountNumber = scanner.nextLine();
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.displayInfo();
                break;
            }
        }

        System.out.print("Enter account number to deposit money: ");
        accountNumber = scanner.nextLine();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(depositAmount);
                account.displayInfo();
                break;
            }
        }

        System.out.print("Enter account number to withdraw money: ");
        accountNumber = scanner.nextLine();
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(withdrawAmount);
                account.displayInfo();
                break;
            }
        }

        System.out.print("Enter account number to change address: ");
        accountNumber = scanner.nextLine();
        System.out.print("Enter new address: ");
        String newAddress = scanner.nextLine();
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.changeAddress(newAddress);
                account.displayInfo();
                break;
            }
        }

        int totalTransactions = 0;
        for (BankAccount account : accounts) {
            totalTransactions += account.getTransactions();
        }
        System.out.println("Total number of transactions across all accounts: " + totalTransactions);

        scanner.close();
    }
}
