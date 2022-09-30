package chapters.chapter06.Exercises_06;
import java.util.Scanner;
public class Exercise_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
displaySortedNumbers(num1,num2,num3);

    }

    public static void displaySortedNumbers(double number1, double number2, double number3) {
        if (number1 > number2 && number1 > number3 && number2 > number3) {
            System.out.println(number1 + "  " + number2 + "  " + number3);
        } else if (number1 > number2 && number1 > number3 && number3 > number2) {
            System.out.println(number1 + "  " + number3 + "  " + number2);
        } else if (number2 > number1 && number2 > number3 && number1 > number3) {
            System.out.println(number2 + "  " + number1 + "  " + number3);
        } else if (number2 > number1 && number2 > number3 && number3 > number1) {
            System.out.println(number2 + "  " + number3 + "  " + number1);
        } else if (number3 > number2 && number3 > number1 && number1 > number2) {
            System.out.println(number3 + "  " + number1 + "  " + number2);
        } else if (number3 > number2 && number3 > number2 && number2 > number1) {
            System.out.println(number3 + "  " + number2 + "  " + number1);
        }


    }
}