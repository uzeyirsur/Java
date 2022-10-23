package chapters.chapter08.Exercises_08;

public class Exercise_08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print( + m[i][j] + " ");
            }
            System.out.print("\t");
        }
    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int randomIndex = (int) (Math.random() * m.length);
            int[] temp = m[i];
            m[i] = m[randomIndex];
            m[randomIndex] = temp;
        }
    }
}
