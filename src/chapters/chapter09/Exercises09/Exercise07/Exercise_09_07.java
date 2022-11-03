package chapters.chapter09.Exercises09.Exercise07;

public class Exercise_09_07 {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20_000);
        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2_500);
        account1.deposit(3_000);
        System.out.println("balance: " + account1.getBalance());
        System.out.println("monthly interest: " + account1.getMonthlyInterest());
        System.out.println("This account was created : " + account1.getDateCreated());

    }
}
