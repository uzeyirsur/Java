package chapters.chapter08.Listings_08;

import java.util.Scanner;

public class Listing_08_05 {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
        Scanner keyboard = new Scanner(System.in);
        for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
            int day = keyboard.nextInt();
            int hour = keyboard.nextInt();
            double temperature = keyboard.nextDouble();
            double humidity = keyboard.nextDouble();
            data[day - 1][hour - 1][0]= temperature;
            data[day - 1][hour - 1][1]= humidity;
        }
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyTemperatureTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];
            }
            System.out.println("Day " + i + "'s average temperature is " + dailyTemperatureTotal / NUMBER_OF_HOURS);
            System.out.println("Day " + i + "'s average humidity is " + dailyHumidityTotal / NUMBER_OF_HOURS);
        }

    }
}
