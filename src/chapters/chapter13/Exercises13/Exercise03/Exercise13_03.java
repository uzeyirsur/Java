package chapters.chapter13.Exercises13.Exercise03;

import java.util.ArrayList;

public class Exercise13_03 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        sort(list);
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 100));
        }
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < min.doubleValue()) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);
            }
        }
    }
}
