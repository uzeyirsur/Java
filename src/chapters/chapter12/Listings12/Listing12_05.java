
package chapters.chapter12.Listings12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Listing12_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do{
            try{
                System.out.println("Enter an integer:");
                int number = input.nextInt();
                continueInput = false;
            }catch (InputMismatchException ex){
                System.out.println("Try again. (Incorrect input: an integer is required)");
                input.nextLine();

            }
        }while(continueInput);
    }
}
