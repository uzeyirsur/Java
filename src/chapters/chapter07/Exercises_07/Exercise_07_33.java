
package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        String[] zodiacAnimals = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.println(zodiacAnimals[year % 12]);
    }
}
