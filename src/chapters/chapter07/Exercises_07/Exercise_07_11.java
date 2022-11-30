
package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The mean is " + mean(numbers));
        System.out.println("The standart deviation is " + deviation(numbers));
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum / x.length;
    }

    public static double deviation(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i] - mean(x), 2);
        }
        return Math.sqrt(sum / (x.length - 1));
    }
}
