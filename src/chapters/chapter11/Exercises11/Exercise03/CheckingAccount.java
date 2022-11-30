
package chapters.chapter11.Exercises11.Exercise03;

import chapters.chapter09.Exercises09.Exercise07.Account;

public class CheckingAccount extends Account {
    private double overDraftLimit;

    public CheckingAccount() {
        this.overDraftLimit = -100;
    }

    public CheckingAccount(int newId, double newBalance) {
        super(newId, newBalance);
        this.overDraftLimit = -100;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() > overDraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance. You can not withdraw money");
        }
    }

    @Override
    public String toString() {
        return "Balance: " + getBalance() + "\nMonthly Interest: " + getMonthlyInterest() + "\nCreation Date: " + getDateCreated() +
                "\nOverdraft Limit: " + this.overDraftLimit;
    }
}
