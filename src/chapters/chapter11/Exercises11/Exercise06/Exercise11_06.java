package chapters.chapter11.Exercises11.Exercise06;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise11_06 {
    public static void main(String[] args) {
       String[] array = {"red","green","blue"};
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);

        String[] array1 = new String[list.size()];
        list.toArray(array1);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
Integer[] array2 = {1,45,34,12,3,2,2};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array2));
      java.util.Collections.sort(list1);
        System.out.println(list1);
    }
}
