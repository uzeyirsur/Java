
package chapters.chapter06.Exercises_06;

import java.util.Scanner;

public class Exercise_06_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides : ");
        int n = input.nextInt();
        System.out.println("Enter the side : ");
        double side = input.nextDouble();
        System.out.println( "The area of the polygon is " + area(n,side));
    }
    public static double area(int n,double side){
        return (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI / n));
    }
}
