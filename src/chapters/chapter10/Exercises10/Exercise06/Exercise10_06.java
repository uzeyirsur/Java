
package chapters.chapter10.Exercises10.Exercise06;

import chapters.chapter10.Listings10.Listing10_08.StackOfIntegers;

public class Exercise10_06 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int number = 2; number <= 120; number++) {
            if(isPrime(number)){
                stack.push(number);
            }
        }
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
