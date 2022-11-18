package chapters.chapter11.Exercises11.Exercise04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers, it ends with a 0:");

        int number;
        while ((number = input.nextInt()) != 0) {
            list.add(number);
        }

        System.out.println("The largest number is " + max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0 || list.isEmpty()) {
            return null;
        }
        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

}
