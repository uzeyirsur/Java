
package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] eliminatedNums = eliminateDuplicates(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (eliminatedNums[i] != 0) {
                System.out.print(eliminatedNums[i] + " ");
            }
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] eliminatedNumbers = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            if (linearSearch(eliminatedNumbers, key) < 0) {
                eliminatedNumbers[i] = key;
            }
        }
        return eliminatedNumbers;

    }

    public static int linearSearch(int[] eliminatedNumbers, int key) {
        for (int i = 0; i < eliminatedNumbers.length; i++) {
            if (key == eliminatedNumbers[i]) {
                return i;
            }
        }
        return -1;
    }

}
