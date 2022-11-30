
package chapters.chapter11.Exercises11.Exercise03;

import chapters.chapter09.Exercises09.Exercise07.Account;

public class SavingAccount extends Account {
    private double overdraftLimit;

    public SavingAccount() {
        overdraftLimit = 0;
    }

    public SavingAccount(int newId, double newBalance) {
        super(newId, newBalance);
        this.overdraftLimit = 0;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() > this.overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance. You can not withdraw money.");
        }
    }

    @Override
    public String toString() {
        return "Balance: " + getBalance() + "\nMonthly Interest: " + getMonthlyInterest() + "\nCreation Date: " + getDateCreated() +
                "\nOverdraft Limit: " + this.overdraftLimit;
    }
}
