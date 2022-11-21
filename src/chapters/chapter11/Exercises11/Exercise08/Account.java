package chapters.chapter11.Exercises11.Exercise08;

import chapters.chapter09.Listing09.A;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private String name;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account() {
        dateCreated = new Date();
        transactions = new ArrayList<>();


    }

    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account(String newName, int newId, double newBalance) {
        this(newId, newBalance);
        this.name = newName;
        transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (this.getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {
        balance -= amount;
        Transaction transaction = new Transaction('W', amount, this.balance, "Standard process");
        transactions.add(transaction);
    }

    public void deposit(double amount) {
        balance += amount;
        Transaction transaction = new Transaction('D', amount, this.balance, "Standard process");
        transactions.add(transaction);
    }


    public String toString() {
        return "Name: " + name +
                "\nID: " + id +
                "\nBalance: " + getBalance() +
                "\nMonthly Interest: " + getMonthlyInterest() +
                "\nCreation Date: " + getDateCreated() +
                "\nTransaction: " + transactions.toString();

    }
}
