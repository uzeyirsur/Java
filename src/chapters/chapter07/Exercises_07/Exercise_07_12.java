
package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double [] reverse = reverse(numbers);
        for (int i = 0; i < reverse.length ; i++) {
            System.out.print(reverse[i] + " ");
        }
    }
    public static double[] reverse(double[] numbers){
        double[] reverse = new double[numbers.length];
        for (int i = 0,j= numbers.length-1; i < numbers.length; i++,j--) {

            reverse[i] = numbers[j];

        }
        return reverse;
    }
}
