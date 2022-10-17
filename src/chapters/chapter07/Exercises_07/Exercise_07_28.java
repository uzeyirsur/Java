package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers: ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        displayAllCombinations(list);
    }

    public static void displayAllCombinations(int[] list) {
        int count = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                count++;
                System.out.print(list[i] + "-" + list[j]);
                System.out.printf(count % 10 == 0 ? "\n" : "  ");
            }
        }
    }
}
