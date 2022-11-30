
package chapters.chapter09.Exercises09.Exercise10;

import java.util.Scanner;

public class Exercise_09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter values for a and b and c ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if (equation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("root: " + equation.getRoot1());
        } else {
            System.out.println("root1 : " + equation.getRoot1() + "\t\troot2: " + equation.getRoot2());
        }
    }
}
