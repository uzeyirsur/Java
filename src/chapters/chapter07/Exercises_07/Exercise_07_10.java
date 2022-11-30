
package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double [] numbers = new double[10];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println(indexOfSmallestElement(numbers));
    }
    public static int indexOfSmallestElement(double[] numbers){
      int minIndex = -1;
        double minValue = numbers[0];
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] < minValue){
               minValue = numbers[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
