package chapters.chapter08.Exercises_08;

import java.util.Scanner;

public class Exercise_08_21 {
    public static void main(String[] args) {
        double[][] coordinates = getCoordinatesFromUser();

        getTheCentralCity(coordinates);
    }

    public static double[][] getCoordinatesFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cities:");
        int numOfCities = input.nextInt();
        System.out.println("Enter the coordinates of the cities:");
        double[][] coordinates = new double[numOfCities][2];
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                coordinates[i][j] = input.nextDouble();
            }
        }

        return coordinates;
    }

    public static void getTheCentralCity(double[][] coordinates) {

        double currentMinTotalDistance = Integer.MAX_VALUE;
        double[] centralCityCoordinate = new double[2];
        double totalDistance = 0;
        for (int i = 0; i < coordinates.length - 1; i++) {
            for (int j = i + 1; j < coordinates.length; j++) {
                totalDistance += Math.sqrt(Math.pow(coordinates[i][0] - coordinates[j][0], 2) + Math.pow(coordinates[i][1] - coordinates[j][1], 2));
            }
            if (totalDistance < currentMinTotalDistance) {
                currentMinTotalDistance = totalDistance;
                centralCityCoordinate[0] = coordinates[i][0];
                centralCityCoordinate[1] = coordinates[i][1];
            }
        }
        System.out.println("The central city is at (" + centralCityCoordinate[0] + ", " + centralCityCoordinate[1] + ")");
        System.out.println("The total distance to all other cities is " + currentMinTotalDistance);
    }
}
