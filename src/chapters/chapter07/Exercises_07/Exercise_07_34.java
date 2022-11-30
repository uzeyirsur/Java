
package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = input.nextLine();
        s = s.toLowerCase();
        System.out.println(sort(s));
    }

    public static String sort(String s) {
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        for (int i = 0; i < ch.length - 1; i++) {
            char currentMin = ch[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < ch.length; j++) {
                if (currentMin > ch[j]) {
                    currentMin = ch[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                ch[currentMinIndex] = ch[i];
                ch[i] = currentMin;
            }

        }
        s = "";
        for (int i = 0; i < ch.length; i++) {
            s += ch[i];
        }
        return s;
    }
}
