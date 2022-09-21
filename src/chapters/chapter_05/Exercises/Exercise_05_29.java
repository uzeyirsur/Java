package chapters.chapter_05.Exercises;

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
		
		
		for (int m = 0; m < 12; m++) {
			if (m == 1 || m == 3 || m == 5 || m ==7 || m == 8 || m == 10 ) {
				day += 31;
			}else if (isLeapYear) {
				day += 29;
			}else if (m == 2) {
				day += 28;
			}else {
				day += 30;
			}
			switch (m) {
			case 0 : System.out.printf("%25s %d\n", "January", year);break;
			case 1 : System.out.printf("%25s %d\n", "February", year);break;
			case 2 : System.out.printf("%25s %d\n", "March", year);break;
			case 3 : System.out.printf("%25s %d\n", "April", year);break;
			case 4 : System.out.printf("%25s %d\n", "May", year);break;
			case 5 : System.out.printf("%25s %d\n", "June", year);break;
			case 6 : System.out.printf("%25s %d\n", "July", year);break;
			case 7 : System.out.printf("%25s %d\n", "August", year);break;
			case 8 : System.out.printf("%25s %d\n", "September", year);break;
			case 9 : System.out.printf("%25s %d\n", "October", year);break;
			case 10 : System.out.printf("%25s %d\n", "November", year);break;
			case 11 : System.out.printf("%25s %d\n", "December", year);break;
			}
			System.out.println("------------------------------------------------------");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
				int firstDay = day % 7;
				
				if (m == 0 || m == 2 || m == 4 || m ==6 || m == 7 || m == 9 ) {
		for (int i = 1; i <= 31; i++) {
			switch (firstDay) {
			case 0:
				System.out.print(i);
				System.out.print(i % 7 == 0 ? "\n" : "\t");
				break;
			case 1:
				if (i == 1) {
					System.out.print("\t" + i + "\t");
				} else {
					System.out.print((i + 1) % 7 == 0 ? i + "\n" : i + "\t");
					break;
				}
			case 2:
				if (i == 1) {
					System.out.print("\t\t" + i + "\t");
				} else {
					System.out.print((i + 2) % 7 == 0 ? i + "\n" : i + "\t");
					
				}
				break;
			case 3:
				if (i == 1) {
					System.out.print("\t\t\t" + i + "\t");
				} else {
					System.out.print((i + 3) % 7 == 0 ? i + "\n" : i + "\t");
				}
				break;
			case 4:
				if (i == 1) {
					System.out.print("\t\t\t\t" + i + "\t");
				} else {
					System.out.print((i + 4) % 7 == 0 ? i + "\n" : i + "\t");
				}
				break;
			case 5:
				if (i == 1) {
					System.out.print("\t\t\t\t\t" + i + "\t");
				} else {
					System.out.print((i + 5) % 7 == 0 ? i + "\n" : i + "\t");
				}
				break;
			case 6:
				if (i == 1) {
					System.out.print("\t\t\t\t\t\t" + i + "\n");
				} else {
					System.out.print((i + 6) % 7 == 0 ? i + "\n" : i + "\t");
				}
				break;
			
			}
			}
		}
				System.out.println("\n\n\n");
			}
		}
	
}

