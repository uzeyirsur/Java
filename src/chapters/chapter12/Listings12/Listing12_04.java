package chapters.chapter12.Listings12;

import chapters.chapter11.Exercises11.Exercise08.Account;

import java.util.Scanner;

public class Listing12_04 {
    public static int quotient(int number1, int number2){
        if(number2 ==0){
            throw new ArithmeticException("Divisor can not be zero");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try{
            int result = quotient(number1,number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        }
        catch (ArithmeticException ex){
            System.out.println("Exception: an integer cannot be divided by zero ");
        }
        System.out.println("Execution continues...");
    }
}
