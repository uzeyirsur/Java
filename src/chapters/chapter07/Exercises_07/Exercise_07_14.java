package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integers :");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The gcd of theese numbers is " + gcd(numbers));
    }

    public static int gcd(int... numbers) {
        java.util.Arrays.sort(numbers);
        int gcd = 1;
        int k = 2;
        while (k <= numbers[0]) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % k != 0) {
                    break;
                }
                gcd = k;
            }
            k++;
        }
        return gcd;
    }
}
