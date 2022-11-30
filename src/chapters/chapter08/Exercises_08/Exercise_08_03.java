
package chapters.chapter08.Exercises_08;

public class Exercise_08_03 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] scoresAndIndex = new int[answers.length][2];
        for (int i = 0; i < answers.length; i++) {
            int correctCounter = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCounter++;
                }
            }
            scoresAndIndex[i][0] = correctCounter;
            scoresAndIndex[i][1] = i;
        }
        for (int i = 0; i < scoresAndIndex.length - 1; i++) {
            for (int j = i + 1; j < scoresAndIndex.length; j++) {
                if (scoresAndIndex[i][0] > scoresAndIndex[j][0]) {
                    int[] temp = scoresAndIndex[i];
                    scoresAndIndex[i] = scoresAndIndex[j];
                    scoresAndIndex[j] = temp;
                }
            }
        }
        for (int i = 0; i < scoresAndIndex.length; i++) {
            System.out.println(scoresAndIndex[i][1] + "'s" + " student have " + scoresAndIndex[i][0] + " correct answer.");
        }
    }

}
