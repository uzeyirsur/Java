package chapters.chapter11.Exercises11.Exercise11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        sort(list);
        System.out.println(list.toString());
    }

    public static void sort(ArrayList<Integer> list) {
        ArrayList<Integer> sortedList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            sortedList.add(java.util.Collections.min(list));
            list.remove(java.util.Collections.min(list));
        }
        for (int i = 0; i < sortedList.size(); i++) {
            list.add(sortedList.get(i));
        }
    }
}