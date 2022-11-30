
package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_34 {
    public static void main(String[] args) {
        double[][] points = getPointsFromUser();
        double[] rightmostLowestPoint = getRightmostLowestPoint(points);

        System.out.println("The rigthmost lowest point is (" + rightmostLowestPoint[0] + ", " + rightmostLowestPoint[1] + ")");
    }

    public static double[][] getPointsFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 6 points:");
        double[][] points = new double[6][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
        }
        return points;
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double currentLowestPoint = points[0][1];
        int currentLowestPointIndex = 0;
        for (int i = 0; i < points.length - 1; i++) {
            if (points[i][1] < currentLowestPoint) {
                currentLowestPoint = points[i][1];
                currentLowestPointIndex = i;
            } else if (points[i][1] == currentLowestPoint) {
                if (points[i][0] > points[currentLowestPointIndex][0]) {
                    currentLowestPointIndex = i;
                }
            }

        }
        double[] rightmostLowestPoint = new double[2];
        rightmostLowestPoint[0] = points[currentLowestPointIndex][0];
        rightmostLowestPoint[1] = points[currentLowestPointIndex][1];

        return rightmostLowestPoint;
    }
}
