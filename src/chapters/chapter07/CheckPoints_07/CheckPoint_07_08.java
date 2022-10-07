package chapters.chapter07.CheckPoints_07;

public class CheckPoint_07_08 {
    public static void main(String[] args) {
        //a
        double[] numbers = new double[10];
        //b
        numbers[9] = 5.5;
        //c
        System.out.println(numbers[0] + numbers[1]);
        //d
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum is " + sum);

        //e

        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("The min is " + min);

int index = (int) (Math.random() * numbers.length);
        System.out.println(numbers[index]);
double[] newNumbers = {3.5,5.5,4.52,5.6};
        }
    }

