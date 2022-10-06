package chapters.chapter06.Exercises_06;

import java.util.Scanner;

public class Exercise_06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the pentagon: ");
        double side = input.nextDouble();
        System.out.println(area(side));
    }

    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
