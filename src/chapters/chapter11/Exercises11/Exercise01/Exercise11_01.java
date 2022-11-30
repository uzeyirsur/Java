
package chapters.chapter11.Exercises11.Exercise01;

import java.util.Scanner;

public class Exercise11_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 sides of a triangle, its color and to fill this triangle enter 1, otherwise enter 0:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        String color = input.next();

        int numberFilled = input.nextInt();
        boolean isFilled = false;
        if (numberFilled == 1) {
            isFilled = true;
        } else if (numberFilled == 0) {
            isFilled = false;
        } else {
            System.out.println("Invalid input!");
        }


        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);

        System.out.println(triangle.toString());

    }
}
