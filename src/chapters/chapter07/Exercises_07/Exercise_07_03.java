package chapters.chapter07.Exercises_07;

import java.util.Scanner;

public class Exercise_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100(Ends with 0): ");
        int[] numbers = new int[100];
        int i = 0;
        do {
            numbers[i] = input.nextInt();
            i++;
        } while (numbers[i - 1] != 0);
        int counts[] = counts(numbers);
        for (int j = 0; j < counts.length; j++) {

            if (counts[j] != 0) {
                System.out.print(j + " occurs " + counts[j] );
                if(counts[numbers[j]] == 1){
                    System.out.println(" time.");
                }else{
                    System.out.println(" times.");
                }
            }
        }

    }

    public static int[] counts(int[] numbers) {
        int counts[] = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                break;
            }
            counts[numbers[i]]++;
        }
        return counts;
    }
}




