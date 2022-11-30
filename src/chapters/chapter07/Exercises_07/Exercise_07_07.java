
package chapters.chapter07.Exercises_07;

public class Exercise_07_07 {
    public static void main(String[] args) {

        int[] randomNumbers = getRandomNumbers();
        int[] counts = countTheNumberOfIntegers(randomNumbers);
        int countLine = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            countLine++;
            System.out.print(countLine % 20 == 0 ? randomNumbers[i] + "\n" : randomNumbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println(counts[i] + " times " + i);
            }
        }
    }

    private static int[] countTheNumberOfIntegers(int[] randomNumbers) {
        int[] counts = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            counts[randomNumbers[i]]++;
        }
        return counts;
    }

    public static int[] getRandomNumbers() {
        int[] randomNumbers = new int[100];
        for (int i = 0; i < 100; i++) {
            randomNumbers[i] = (int) (Math.random() * 10);
        }
        return randomNumbers;
    }
}
