package chapters.chapter12.Exercises12.Exercise06;

import java.util.Scanner;

public class Exercise12_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        hex = hex.toUpperCase();
        try {
            hex2Dec(hex);
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex));
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. String must be hex string.");
        }


    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if ('A' <= ch && ch <= 'Z') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }

    public static void hex2Dec(String hex) throws NumberFormatException {
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'))) {
                throw new NumberFormatException("Input must be a hex string");
            }
        }
    }
}
