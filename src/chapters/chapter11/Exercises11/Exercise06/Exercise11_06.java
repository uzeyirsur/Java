
package chapters.chapter11.Exercises11.Exercise06;

import chapters.chapter10.Listings10.Loan;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.Date;

public class Exercise11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add(new Circle());

        for (Object o : list) {
            System.out.println(o.toString());
        }

    }
}
