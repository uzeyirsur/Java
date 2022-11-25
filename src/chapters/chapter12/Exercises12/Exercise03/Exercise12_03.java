package chapters.chapter12.Exercises12.Exercise03;

import java.util.Scanner;

public class Exercise12_03 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the index of the array: ");
        int index = input.nextInt();

        try {
            System.out.println(numbers[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }
}
