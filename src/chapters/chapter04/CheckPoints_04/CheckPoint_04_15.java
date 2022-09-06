package chapters.chapter04.CheckPoints_04;

import java.util.Scanner;

public class CheckPoint_04_15 {
	public static void main(String[] args) {
		System.out.println('a' < 'b');
		System.out.println('a' <= 'A');
		System.out.println('a' < 'b');
		System.out.println('a' >= 'A');
		System.out.println('a' == 'a');
		System.out.println('a' != 'b');

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line: ");
		String s = input.nextLine();
char ch = s.charAt(1);
System.out.println(ch);


String s1 = "Welcome to Java";
String s2 = "Welcome to Java";
String s3 = "Welcome to C++";
System.out.println(s1.equals(s2)); // true
System.out.println(s1.equals(s3));

if (s1 == s3)
System.out.println("string1 and string2 are the same object");
else
System.out.println("string1 and string2 are different objects");
		
	}
}