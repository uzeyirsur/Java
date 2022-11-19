package chapters.chapter11.Exercises11.Exercise10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {


    public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        Object o = get((size() - 1));
        remove((size() - 1));
        return o;
    }

    public void push(Object o) {
        add(o);

    }

    @Override
    public String toString() {
        String s = "Stack: \n";
        for (int i = size() - 1; i >= 0; i--) {
            s += get(i) + " ";
        }
        return s;
    }
}
