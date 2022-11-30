
package chapters.chapter12.Exercises12.Exercise15;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise12_15 {
    public static void main(String[] args) throws Exception {

        File file = new File("Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            return;
        }
        PrintWriter output = new PrintWriter(file);
        for (int i = 0; i < 100; i++) {
            output.print((int) (Math.random() * 100) + " ");
        }
        output.close();

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            numbers.add(input.nextInt());
        }
        input.close();
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
