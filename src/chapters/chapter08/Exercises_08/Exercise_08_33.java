package chapters.chapter08.Exercises_08;

import java.util.Scanner;

/*
1- Get coordinates -From user
2- Get intersecting point - With getintersectingpoint method.
3- Find the sides - Calculate the distance between two points.
4- Calculate and display the areas -
 */
public class Exercise_08_33 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        double[] interSectPoint = getIntersectingPoint(points);
        double[][] triangle1 = new double[3][2];

        double x1 = points[0][0];
        double x2 = points[1][0];
        double x3 = points[2][0];
        double x4 = points[3][0];
        double y1 = points[0][1];
        double y2 = points[1][1];
        double y3 = points[2][1];
        double y4 = points[3][1];


        triangle1[0][0] = x1;
        triangle1[0][1] = y1;
        triangle1[1][0] = x2;
        triangle1[1][1] = y2;
        triangle1[2][0] =interSectPoint[0];
        triangle1[2][1] = interSectPoint[1];
        System.out.println(  getTriangleArea(triangle1));



    }

    public static double[][] getPoints() {
        double[][] points = new double[4][2];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2,x3,y3,x4,y4:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }

        }
        return points;
    }

    public static double[] getIntersectingPoint(double[][] p) {
        double[] interSectPoint = new double[2];

        double a = p[0][1] - p[2][1];
        double b = p[0][0] - p[2][0];
        double c = p[1][1] - p[3][1];
        double d = p[1][0] - p[3][0];
        double e = (p[0][1] - p[2][1]) * p[0][0] - (p[0][0] - p[2][0]) * p[0][1];
        double f = (p[1][1] - p[3][1]) * p[1][0] - (p[1][0] - p[3][0]) * p[1][1];

        interSectPoint[0] = (e * d - b * f) / (a * d - b * c);
        interSectPoint[1] = (a * f - e * c) / (a * d - b * c);

        if (a * d - b * c == 0) {
            return null;
        }
        return interSectPoint;
    }

    public static double getTriangleArea(double[][] p) {
        double side1 = Math.sqrt(Math.pow(p[1][0] - p[0][0], 2) + Math.pow(p[1][1] - p[0][1], 2));
        double side2 = Math.sqrt(Math.pow(p[2][0] - p[0][0], 2) + Math.pow(p[2][1] - p[0][1], 2));
        double side3 = Math.sqrt(Math.pow(p[2][0] - p[1][0], 2) + Math.pow(p[2][1] - p[1][1], 2));
        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
