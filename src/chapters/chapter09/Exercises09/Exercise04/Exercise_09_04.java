
package chapters.chapter09.Exercises09.Exercise04;

import java.util.Random;

public class Exercise_09_04 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 50; i++) {

            System.out.print(i % 10 == 0 ? random.nextInt(100) + "\n" : random.nextInt(100) + " ");
        }
    }
}
