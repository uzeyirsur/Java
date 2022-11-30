
package chapters.chapter05.Exercises_05;

import java.util.Scanner;
                                                                       //NOT FINISHED YET 
public class Exercise_05_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		System.out.println("Enter the first day of the year (e.g for Sunday 0, Monday 1 etc.):");
		int day = input.nextInt();
boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || (year % 400 == 0);
		int firstDay = 0;
for (int m = 1; m <= 12; m++ ) {
			switch (m) {
			case 1: System.out.println("\t\t\tJanuary " + year);break;
			case 2: System.out.println("\t\t\tFebruary " + year);day += 31;break;
			case 3: System.out.println("\t\t\tMarch " + year);
			if (isLeapYear) {
				day += 29;
			}else {
				day += 28;
			}break;
			case 4: System.out.println("\t\t\tApril " + year);  day += 31;break;
			case 5: System.out.println("\t\t\tMay " + year); day += 30; break;
			case 6: System.out.println("\t\t\tJune " + year);  day +=31;break;
			case 7: System.out.println("\t\t\tJuly " + year); day += 30;break;
			case 8: System.out.println("\t\t\tAugust " + year); day += 31;break;
			case 9: System.out.println("\t\t\tSeptember " + year); day += 31;break;
			case 10: System.out.println("\t\t\tOctober " + year); day +=30;break;
			case 11: System.out.println("\t\t\tNovember " + year);day += 31; break;
			case 12: System.out.println("\t\t\tDecember " + year);day += 30; break;
			}
			System.out.println("----------------------------------------------------------------");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			int i = 0;
			firstDay = day % 7;
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				for ( i = 1; i <= 31; i++) {
					switch (firstDay) {
					case 0 : System.out.print(i % 7 == 0 ? i + "\n" : i + "\t");
					break;
					case 1 : if (i == 1) { 
						System.out.print("\t");
					}
					System.out.print((i + 1) % 7 == 0 ? i + "\n" : i + "\t");
					break;
					
					case 2 :if (i ==1) {
						System.out.print("\t\t");
					}
					System.out.print((i + 2) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 3 : if (i ==1) {
						System.out.print("\t\t\t");
					}
					System.out.print((i + 3) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 4 : if (i ==1) {
						System.out.print("\t\t\t\t");
					}
					System.out.print((i + 4) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 5 : if ( i==1) {
						System.out.print("\t\t\t\t\t");
					}
					System.out.print((i + 5) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 6 : if (i ==1 ) {
						System.out.print("\t\t\t\t\t\t");
					}
					System.out.print((i + 6) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					
					}
				}
			}else if (m == 2 && isLeapYear) {
				for ( i = 1; i <=29; i++ ) {
					switch (firstDay) {
					case 0 : System.out.print(i % 7 == 0 ? i + "\n" : i + "\t");
					break;
					case 1 : if (i == 1) { 
						System.out.print("\t");
					}
					System.out.print((i + 1) % 7 == 0 ? i + "\n" : i + "\t");
					break;
					
					case 2 :if (i ==1) {
						System.out.print("\t\t");
					}
					System.out.print((i + 2) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 3 : if (i ==1) {
						System.out.print("\t\t\t");
					}
					System.out.print((i + 3) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 4 : if (i ==1) {
						System.out.print("\t\t\t\t");
					}
					System.out.print((i + 4) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 5 : if ( i==1) {
						System.out.print("\t\t\t\t\t");
					}
					System.out.print((i + 5) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 6 : if (i ==1 ) {
						System.out.print("\t\t\t\t\t\t");
					}
					System.out.print((i + 6) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					
					}
					}
				}
			else if (m == 2) {
				for ( i = 1; i <= 28; i++) {
					switch (firstDay) {
					case 0 : System.out.print(i % 7 == 0 ? i + "\n" : i + "\t");
					break;
					case 1 : if (i == 1) { 
						System.out.print("\t");
					}
					System.out.print((i + 1) % 7 == 0 ? i + "\n" : i + "\t");
					break;
					
					case 2 :if (i ==1) {
						System.out.print("\t\t");
					}
					System.out.print((i + 2) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 3 : if (i ==1) {
						System.out.print("\t\t\t");
					}
					System.out.print((i + 3) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 4 : if (i ==1) {
						System.out.print("\t\t\t\t");
					}
					System.out.print((i + 4) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 5 : if ( i==1) {
						System.out.print("\t\t\t\t\t");
					}
					System.out.print((i + 5) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 6 : if (i ==1 ) {
						System.out.print("\t\t\t\t\t\t");
					}
					System.out.print((i + 6) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					
					}
				}
			}else {
				for ( i = 1; i <=30; i++) {
					switch (firstDay) {
					case 0 : System.out.print(i % 7 == 0 ? i + "\n" : i + "\t");
					break;
					case 1 : if (i == 1) { 
						System.out.print("\t");
					}
					System.out.print((i + 1) % 7 == 0 ? i + "\n" : i + "\t");
					break;
					
					case 2 :if (i ==1) {
						System.out.print("\t\t");
					}
					System.out.print((i + 2) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 3 : if (i ==1) {
						System.out.print("\t\t\t");
					}
					System.out.print((i + 3) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 4 : if (i ==1) {
						System.out.print("\t\t\t\t");
					}
					System.out.print((i + 4) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 5 : if ( i==1) {
						System.out.print("\t\t\t\t\t");
					}
					System.out.print((i + 5) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					case 6 : if (i ==1 ) {
						System.out.print("\t\t\t\t\t\t");
					}
					System.out.print((i + 6) % 7 == 0 ? i + "\n" : i + "\t" );
					break;
					
					}
				}
			}
		System.out.print("\n\n\n\n\n");
			
			}
			
			}
		}
