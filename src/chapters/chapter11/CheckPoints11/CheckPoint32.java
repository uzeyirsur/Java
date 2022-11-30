
package chapters.chapter11.CheckPoints11;

import java.util.ArrayList;

public class CheckPoint32 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Dallas");
        list.add("Dallas");
        list.add("Houston");
        list.add("Dallas");

       list.remove("Dallas");
        System.out.println(list.toString());

        for (int i = 0; i < list.size(); i++) {
            list.remove("Dallas");
        }
        System.out.println(list.toString());
    }
}
