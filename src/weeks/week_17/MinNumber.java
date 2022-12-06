package weeks.week_17;

import java.util.ArrayList;

public class MinNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int)(1 +Math.random() * 99));
        }
        System.out.println(min(list));
    }
    public static int min(ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if(min > list.get(i)){
                min = list.get(i);
            }
        }
        return min;
    }
}
