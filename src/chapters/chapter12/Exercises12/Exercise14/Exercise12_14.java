package chapters.chapter12.Exercises12.Exercise14;

import java.io.File;
import java.util.Scanner;

public class Exercise12_14 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a file path name:");
        File file = new File(keyboard.nextLine());

        if (!file.exists()) {
            System.out.println("There is no such a file.Please check your path name.");
            return;
        }
        int count = 0;
       double total = 0;
        try (
                Scanner text = new Scanner(file);
        ) {
            while (text.hasNext()) {
        total += text.nextDouble();
        count++;
            }
        }
        System.out.println("The total score is " + total);
        System.out.println("The average is " + (total/count));

    }
}
