package chapters.chapter12.Exercises12.Exercise25;

import java.io.File;
import java.util.Scanner;

public class Exercise12_25 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\omers\\workspace\\InarAcademy\\Java_InarAcademy\\Salary.txt");
        if (!file.exists()) {
            System.out.println("File does not exists");
            return;
        }
        double[] total = new double[4];
        int[] count = new int[4];

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String firstName = input.next();
                String lastName = input.next();
                String rank = input.next();
                double salary = input.nextDouble();

                total[0] += salary;
                count[0]++;

                switch (rank) {
                    case "assistant":
                        total[1] += salary;
                        count[1]++;
                    case "associate":
                        total[2] += salary;
                        count[2]++;
                    case "full":
                        total[3] += salary;
                        count[3]++;
                }


            }

        }

        System.out.println("The total salary is " + total[0] + " and the average is " + (total[0] / count[0]));
        System.out.println("Assistant's total salary is " + total[1] + " and the average is " + (total[1] / count[1]));
        System.out.println("Associate's total salary is " + total[2] + " and the average is " + (total[2] / count[2]));
        System.out.println("Full's total salary is " + total[3] + " and the average is " + (total[3] / count[3]));
    }
}
