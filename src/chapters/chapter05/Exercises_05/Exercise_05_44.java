package chapters.chapter05.Exercises_05;

import java.util.Scanner;

public class Exercise_05_44 {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("Enter an short integer: ");
 short number = input.nextShort();
 System.out.print("The 16 bits are :");
 for (short i = 15; i >= 0; i--) {
	 System.out.print((number >> i) & 1);
 }
 
 
 }
}

