package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the day (between 0 - 6, e.g 2 for Tuesday for Sunday 0):  ");
		int day = input.nextInt();
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || (year % 400 == 0);
		for (int m = 0; m < 12; m++) {
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 ) {
				day += 31;
			}else if (isLeapYear) {
				day += 29;
			}else if (m == 2) {
			day += 28;	
			}else {
				day += 30;
			}
switch (m) {
case 0 :System.out.print("January 1, " + year +" is ");break;
case 1 :System.out.print("February 1, " + year + " is ");break;
case 2 :System.out.print("March 1, " + year +" is ");break;
case 3 :System.out.print("April 1, " + year + " is "); break;
case 4 :System.out.print("May 1, " + year +" is ");break;
case 5 :System.out.print("Jun 1, " + year + " is "); break;
case 6 :System.out.print("July 1," + year +" is ");break;
case 7 :System.out.print("August 1, " + year + " is "); break;
case 8 :System.out.print("September 1," + year +" is ");break;
case 9 :System.out.print("October 1, " + year + " is "); break;
case 10 :System.out.print("November 1, " + year +" is ");break;
case 11 :System.out.print("December 1, " + year + " is "); break;




}
int firstDay = day % 7 ;
switch (firstDay) {
case 0 : System.out.print("Sunday");break;
case 1 : System.out.print("Monday");break;
case 2 : System.out.print("Tuesday");break;
case 3 : System.out.print("Wednesday");break;
case 4 : System.out.print("Thursday");break;
case 5 : System.out.print("Friday");break;
case 6 : System.out.print("Saturday");break;

}
		System.out.println();	
		}

		

	}

}
