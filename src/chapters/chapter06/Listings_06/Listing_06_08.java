package chapters.chapter06.Listings_06;

import java.util.Scanner;

public class Listing_06_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        System.out.println("The decimal value for hex number" + hex + " is " + hextoDecimal(hex.toUpperCase()));
    }
    public static int hextoDecimal(String hex){
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal (char ch){
        if ('A'<= ch && ch <= 'Z' ){
            return 10 + ch - 'A';
        }else {
            return ch - '0';
        }
    }
}