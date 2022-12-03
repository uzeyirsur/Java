package chapters.chapter13.Exercises13.Exercise01;

import chapters.chapter12.Exercises12.Exercise05.IllegalTriangleException;

import java.util.Scanner;

public class Exercise13_01 {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Enter a color: ");
        triangle.setColor(input.next());

        System.out.println("Enter 1 to fill the triangle or 0 vice versa");
        int fill = input.nextInt();
        if (fill == 1) {
            triangle.setFilled(true);
        } else if (fill == 0) {
            triangle.setFilled(false);
        } else {
            System.out.println("Wrong input! Enter 1 or 0");
        }
        System.out.println(triangle);
    }

}
