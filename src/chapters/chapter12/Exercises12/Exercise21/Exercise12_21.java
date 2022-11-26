package chapters.chapter12.Exercises12.Exercise21;

import java.io.File;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Exercise12_21 {
    public static void main(String[] args) throws Exception {
        File file = new File("SortedStrings.txt");
        PrintWriter output = new PrintWriter(file);
        output.print("Ada Ali Buse Cengiz Deniz Zeynep Burhan");
        output.close();
        if (!file.exists()) {
            System.out.println("File does not exists");
            return;
        }
        String s1 = "";
        String s2 = "";
        boolean isSorted = true;
        try (
                Scanner input = new Scanner(file)
        ) {

            while (input.hasNext() && isSorted) {
               s1 = input.next();
                s2 = input.next();
                if (s1.compareTo(s2) > 0) {
                    System.out.println(s1 + " and " + s2 + " is out of order");
                    isSorted = false;
                }

            }
        }
        if (isSorted) {
            System.out.println("The data is in increasing order.");
        }
    }
}
