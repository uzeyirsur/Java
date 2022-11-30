package chapters.chapter12.Exercises12.Exercise31;

import java.io.File;
import java.util.Scanner;

public class Exercise12_31 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = keyboard.nextInt();

        System.out.println("Enter the gender:");
        String gender = keyboard.next();


        System.out.println("Enter the name: ");
        String name = keyboard.next();

        File file = new File("C:\\Users\\omers\\OneDrive\\Masaüstü\\babynameranking" + year + ".txt");
        if (!file.exists()) {
            System.out.println("File does not exists");
            return;
        }

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                int rank = input.nextInt();
                String maleName = input.next();
                String femaleName = input.next();
                if (gender.equalsIgnoreCase("m") && maleName.equalsIgnoreCase(name) || gender.equalsIgnoreCase("f") && femaleName.equalsIgnoreCase(name)) {
                    System.out.println(name + "'s rank is #" + rank);
                    break;
                }
            }
        }
    }

}
