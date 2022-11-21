package chapters.chapter10.Exercises10.Exercise05;

import chapters.chapter10.Listings10.Listing10_08.StackOfIntegers;

import java.util.Scanner;

public class Exercise10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = input.nextInt();
        StackOfIntegers stack = new StackOfIntegers();
        int a = 2;
        while(number != 1){
            if(number % a == 0){
                stack.push(a);
                number /= a;
            }else{
                a++;
            }
        }
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
