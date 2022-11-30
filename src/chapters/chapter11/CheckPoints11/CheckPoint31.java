
package chapters.chapter11.CheckPoints11;

import java.util.ArrayList;

public class CheckPoint31 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Denver");
        list.add("Austin");
        // list.add(new java.util.Date()); It is not a string.
        String city = list.get(0);
       //list.set(3,"Dallas"); It is wrong because this list have no 3 index.
        System.out.println(list.get(0));

    }
}
