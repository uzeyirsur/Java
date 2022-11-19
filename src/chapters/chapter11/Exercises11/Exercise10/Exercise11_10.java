package chapters.chapter11.Exercises11.Exercise10;

import java.util.Scanner;

public class Exercise11_10 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.nextLine());
        }
        System.out.println(stack.toString());


    }
}
