
package chapters.chapter11.Exercises11.Exercise03;

import chapters.chapter09.Exercises09.Exercise07.Account;

public class Exercise11_03 {
    public static void main(String[] args) {

        Account account = new Account(4273, 10_000);
        SavingAccount savingAccount = new SavingAccount(2145, 5_000);
        CheckingAccount checkingAccount = new CheckingAccount(1212, 100_000);
        System.out.println(account.toString() + "\n\n" + savingAccount.toString() + "\n\n" + checkingAccount.toString());
    }
}
