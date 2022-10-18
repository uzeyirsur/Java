package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten double numbers:");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double[] sortedNumbers = sortNumbers(numbers);
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + " ");
        }
    }

    public static double[] sortNumbers(double[] numbers) {
        double temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        return numbers;
    }

}
