package chapters.chapter13.Exercises13.Exercise02;

import java.util.ArrayList;

public class Exercise13_02 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        shuffle(list);
        System.out.println(list);
    }
    public static void shuffle(ArrayList<Number> list){
     java.util.Collections.shuffle(list);
    }
}
