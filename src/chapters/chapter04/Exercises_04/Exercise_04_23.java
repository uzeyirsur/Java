package chapters.chapter04.Exercises_04;
import java.util.Scanner;
public class Exercise_04_23 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter employee's name: ");
	String name = input.nextLine();
	System.out.print("Enter number of hours worked in a week: ");
	double hours = input.nextDouble();
	System.out.print("Enter hourly pay rate: ");
	double pay = input.nextDouble();
	System.out.print("Enter federal tax withholding rate: ");
	double federalTaxRate = input.nextDouble();
	System.out.print("Enter state tax withholding rate: ");
	double stateTaxRate = input.nextDouble();
	
	double grossPay = hours * pay ;
    double federalTax = grossPay * federalTaxRate;
    double stateTax = grossPay * stateTaxRate;
    double totalTax = federalTax + stateTax;
    double netPay = grossPay - totalTax;
    
    System.out.println("Employee Name: " + name);
    System.out.println("Hours Worked: " + hours);
    System.out.println("Pay Rate: " + pay);
    System.out.println("Gross Pay: " + grossPay);
    System.out.println("Deductions:");
    System.out.println("Federal Withholding (" + federalTaxRate + "):" + federalTax);
    System.out.println("State Withholding (" + stateTaxRate + "):" + stateTax);
    System.out.println("Total Deduction: " + totalTax);
    System.out.println("Net Pay: " + netPay);
	
}
}
