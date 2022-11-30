
package chapters.chapter06.Exercises_06;

import java.util.Scanner;

public class Exercise_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to get reverse of it:");
        int integer = input.nextInt();

        System.out.print("The reverse of the integer " + integer + " is ");
        reverse(integer);
    }

    public static void reverse(int number) {
String s = number + "";
int length = s.length();
for (int i = length -1; i >= 0; i-- ){
    System.out.print(s.charAt(i));
}

    }
}
