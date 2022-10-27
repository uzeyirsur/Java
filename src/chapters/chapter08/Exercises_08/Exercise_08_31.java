package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_31 {
    public static void main(String[] args) {
        double[][] points = new double[4][2];
        getPointsFromUser(points);
double [] interSectPoint = getIntersectingPoint(points);
        if (getIntersectingPoint(points) == null) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.println("The intersecting point is at (" + interSectPoint[0] + ", " + interSectPoint[1] + ")");
        }
    }

    public static void getPointsFromUser(double[][] points) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter four points:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
    }

    public static double[] getIntersectingPoint(double[][] p) {
        double[] interSectPoint = new double[2];

        double a = p[0][1] - p[1][1];
        double b = p[0][0] - p[1][0];
        double c = p[2][1] - p[3][1];
        double d = p[2][0] - p[3][0];
        double e = (p[0][1] - p[1][1]) * p[0][0] - (p[0][0] - p[1][0]) * p[0][1];
        double f = (p[2][1] - p[3][1]) * p[2][0] - (p[2][0] - p[3][0]) * p[2][1];

        interSectPoint[0] = (e * d - b * f) / (a * d - b * c);
        interSectPoint[1] = (a * f - e * c) / (a * d - b * c);

        if(a * d - b * c == 0){
            return null;
        }
        return interSectPoint;
    }
}
