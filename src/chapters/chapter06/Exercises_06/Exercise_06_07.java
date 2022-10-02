package chapters.chapter06.Exercises_06;

import java.util.Scanner;

public class Exercise_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the investment amount:");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter the annual interest rate:");
        double annualInterestRate = input.nextDouble();
        System.out.println("Years\t\t\tFuture Value");

        for (int i = 1; i < 31; i++) {
            System.out.print(i + "\t\t\t\t");
            System.out.printf("%2.2f\n", futureInvestmentValue(investmentAmount, annualInterestRate / 1200, i));
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, double years) {
        double futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyInterestRate), years * 12));
        return futureInvestmentValue;

    }
}
