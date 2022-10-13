package chapters.chapter07.Exercises_07;

public class Exercise_07_02 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printReverse(numbers);
        for (int e : numbers) {
            System.out.print(e + " ");
        }
    }

    public static void printReverse(int[] numbers) {
        int temp = 0;
        for (int i = 0, k = numbers.length - 1; i < numbers.length / 2; i++, k--) {
            temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
        }
    }

}
