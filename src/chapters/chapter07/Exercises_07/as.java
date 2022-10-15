package chapters.chapter07.Exercises_07;

public class as {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 5, 2, 9, 3};
        sort(numbers);
    }

    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentMin = numbers[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (currentMin > numbers[j]) {
    currentMin=numbers[j];
    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                numbers[currentMinIndex] = numbers[i];
                numbers[i]=currentMin;
            }
        }
        return numbers;
    }
}
