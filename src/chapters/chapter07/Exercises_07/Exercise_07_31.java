
package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1(sorted):");
        int numOfInt = input.nextInt();
        int[] list1 = new int[numOfInt];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Enter list2(sorted): ");
        int numOfInt2 = input.nextInt();
        int[] list2 = new int[numOfInt2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        int[] mergedList = getTheMergedList(list1, list2);
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }
    }

    public static int[] getTheMergedList(int[] list1, int[] list2) {
        int[] list3 = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            list3[i] = list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            list3[(list1.length) + i] = list2[i];
        }
        java.util.Arrays.sort(list3);
        return list3;
    }
}
