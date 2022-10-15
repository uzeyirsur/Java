package chapters.chapter07.Exercises_07;

public class Exercise_07_16 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[100_000];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100_000);
        }
        int key = (int) (Math.random() * 100_0000);

        long startTime = System.currentTimeMillis();
        linearSearch(randomNumbers, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        long startTime2 = System.currentTimeMillis();
        binarySearch(randomNumbers, key);
        long endTime2 = System.currentTimeMillis();
        long executionTime2 = endTime2 - startTime2;
        System.out.println("The linearSearch execution time is: " + executionTime);
        System.out.println("The BinarySearch execution time is: " + executionTime2);
    }

    public static int linearSearch(int[] randomNumbers, int key) {
        for (int i = 0; i < randomNumbers.length; i++) {
            if (key == randomNumbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] randomNumbers, int key) {
        int[] sortedNumbers = sortNumbers(randomNumbers);
        int low = 0;
        int high = sortedNumbers.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < sortedNumbers[mid]) {
                high = mid - 1;
            } else if (key == sortedNumbers[mid]) {
                return key;
            } else {
                low = mid + 1;
            }

        }
        return -low - 1;
    }


    public static int[] sortNumbers(int[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length - 1; i++) {
            int currentMin = randomNumbers[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < randomNumbers.length; j++) {
                if (currentMin > randomNumbers[j]) {
                    currentMin = randomNumbers[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                randomNumbers[currentMinIndex] = randomNumbers[i];
                randomNumbers[i] = currentMin;
            }
        }
        return randomNumbers;
    }
}
