package chapters.chapter11.Exercises11.Exercise14;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        System.out.println("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }
        ArrayList<Integer> union = union(list1,list2);
        System.out.print("The combined list is ");
        for (int i = 0; i <union.size() ; i++) {
            System.out.print(union.get(i) + " ");
        }
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            union.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            union.add(list2.get(i));
        }
        return union;
    }
}
