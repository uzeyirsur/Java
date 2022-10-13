package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        int[] distinctNumbers = new int[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isDistinctNumber(numbers[i], distinctNumbers)) {
                distinctNumbers[i] = numbers[i];
                count++;
            }
        }
        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct numbers are ");
        for (int i = 0; i < distinctNumbers.length; i++) {
            if (distinctNumbers[i] != 0) {
                System.out.print(distinctNumbers[i] + " ");
            }
        }


    }

    public static boolean isDistinctNumber(int number, int[] distinctNumbers) {
        for (int i = 0; i < distinctNumbers.length; i++) {
            if (distinctNumbers[i] == 0) {
                continue;
            }
            if (number == distinctNumbers[i]) {
                return false;
            }
        }
        return true;
    }
}