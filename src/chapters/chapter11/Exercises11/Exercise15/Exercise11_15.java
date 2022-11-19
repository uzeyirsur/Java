package chapters.chapter11.Exercises11.Exercise15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the points: ");
        int numberOfPoints = input.nextInt();

        ArrayList<Double> points = new ArrayList<>();
        System.out.println("Enter the coordinates of the points: ");
        for (int i = 0; i < numberOfPoints * 2; i++) {
            points.add(input.nextDouble());
        }

    }

}
