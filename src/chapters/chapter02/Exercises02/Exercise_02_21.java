package chapters.chapter02.Exercises02;
import java.util.Scanner;
public class Exercise_02_21 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter investment amount: ");
	double investmentAmount = input.nextDouble();
	
	System.out.print("Enter annual interest rate in percentage: ");
	double annualInterestRate = input.nextDouble();
	
	System.out.print("Enter number of years: ");
	double years =input.nextDouble();
	
	double monthlyInterestRate = annualInterestRate * (1/100.0);
	
	double futureInvestmentValue = investmentAmount * ( Math.pow((1 + monthlyInterestRate ), years));
	
	System.out.println("Accumulated value is $" +  futureInvestmentValue);
	
	
}
}
