package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int numOfValues = input.nextInt();
        System.out.println("Enter the values: ");
        int[] values = new int[numOfValues];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours.");
        } else {
            System.out.println("The list has no consecutive fours.");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] != values[j]) {
                    break;
                } else {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
