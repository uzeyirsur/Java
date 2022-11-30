
package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of balls to drop:");
        int numOfBalls = input.nextInt();
        System.out.println("Enter the number of slots in the bean machine: ");
        int numOfSlots = input.nextInt();
        int[] slots = new int[numOfSlots];

        for (int i = 0; i < numOfBalls; i++) {
            int countR = 0;
            for (int j = 0; j < slots.length - 1; j++) {
                int dropWay = (int) (Math.random() * 2);
                if (dropWay == 0) {
                    System.out.print("L");
                } else {
                    countR++;
                    System.out.print("R");
                }
            }
            slots[countR]++;
            System.out.println();
        }

        int MaxBallSlot = getTheMaxValue(slots);
        for (int i = 0; i < MaxBallSlot; MaxBallSlot--) {
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] == MaxBallSlot) {
                    System.out.print("O");
                    slots[j]--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }

    public static int getTheMaxValue(int[] slots) {
        int max = slots[0];
        for (int i = 1; i < slots.length; i++) {
            if (max < slots[i]) {
                max = slots[i];
            }
        }
        return max;
    }
}
