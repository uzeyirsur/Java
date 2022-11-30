
package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten double values: ");
        double [] numbers = new double[10];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextDouble();
        }
        avarage(numbers);
        System.out.println(avarage(numbers));
    }
    public static int avarage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum +=array[i];
        }
return sum / array.length;
    }
    public static double avarage(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
