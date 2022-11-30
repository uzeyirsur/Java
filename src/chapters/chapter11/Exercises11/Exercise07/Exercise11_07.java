
package chapters.chapter11.Exercises11.Exercise07;

import java.util.ArrayList;

public class Exercise11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
         shuffle(list);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }


    public static void shuffle(ArrayList<Integer> list) {

        ArrayList<Integer> shuffledList = new ArrayList<>();

        int i = 100;

        while (!list.isEmpty()) {
            int randomIndex = (int) (Math.random() * i);
            shuffledList.add(list.get(randomIndex));
            list.remove(randomIndex);
            i--;
        }
        for (int j = 0; j < shuffledList.size(); j++) {
            list.add(shuffledList.get(j));
        }
    }
}
