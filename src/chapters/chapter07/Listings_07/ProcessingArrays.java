package chapters.chapter07.Listings_07;

import java.util.Scanner;

public class ProcessingArrays {
    public static void main(String[] args) {
        double[] myList = new double[10];
        Scanner input = new Scanner(System.in);
       /* System.out.println("Enter " + myList.length + " value");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
            System.out.println("myList[" + i + "] = " + myList[i]);
        }
        */

        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 100);

        }
        int count = 0;
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];

        }
        System.out.println("Total is " + total);
        double max = myList[0];
        int indexOfMAx = 0;
        for (int i = 1; i < myList.length; i++) {
            if (max < myList[i]) {
                max = myList[i];
                indexOfMAx = i;
            }

        }
     /*   System.out.println("The max value is " + max + " and index of it is " + indexOfMAx);
        for (int i = myList.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
            System.out.print(myList[i] + " ");
        }

      */
        System.out.println();
        double temp = myList[0];
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];
            System.out.print(myList[i - 1] + " ");
        }
        myList[myList.length - 1] = temp;
        System.out.print(myList[myList.length - 1]);


        String[] months = {"January","February"};
        System.out.println("\nEnter 1 or 2 : ");
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber-1]);
    }

}
