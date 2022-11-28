package chapters.chapter12.Exercises12.Exercise23;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise12_23 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());
            double total = 0;
            int count = 0;
            while (input.hasNext()) {
                double number = input.nextDouble();
                count++;
                total += number;
            }
            double average = total / count;
            System.out.println("The total is " + total + "\nThe average is " + average);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
