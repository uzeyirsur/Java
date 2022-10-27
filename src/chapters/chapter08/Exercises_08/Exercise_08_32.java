package chapters.chapter08.Exercises_08;

import java.util.Scanner;

/*
Get points
Find sides  with distance formula
use area formula
 */
public class Exercise_08_32 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        double area = getTriangleArea(points);
        if (area == 0) {
            System.out.println("The three points are on the same line");
        } else
            System.out.println("The area of the triangle is " + area);


    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[3][2];
        System.out.println("Enter x1,y1,x2,y2,x3,y3:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }

        }
        return points;
    }

    public static double getTriangleArea(double[][] p) {
        double side1 = Math.sqrt(Math.pow(p[1][0] - p[0][0], 2) + Math.pow(p[1][1] - p[0][1], 2));
        double side2 = Math.sqrt(Math.pow(p[2][0] - p[0][0], 2) + Math.pow(p[2][1] - p[0][1], 2));
        double side3 = Math.sqrt(Math.pow(p[2][0] - p[1][0], 2) + Math.pow(p[2][1] - p[1][1], 2));
        double s = (side1 + side2 + side3) / 2;

            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
    }

