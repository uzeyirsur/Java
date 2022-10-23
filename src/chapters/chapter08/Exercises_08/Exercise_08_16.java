package chapters.chapter08.Exercises_08;

public class Exercise_08_16 {
    public static void main(String[] args) {
        int[][] m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sort(m);

    }
    public static void sort(int[][] m) {

        for (int i = 0; i < m.length - 1; i++) {

            int currentMinRow = m[i][0];
            int currentMinCol = m[i][1];
            int currentMinIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if(currentMinRow > m[j][0]){
                    currentMinRow = m[j][0];
                    currentMinCol = m[j][1];
                    currentMinIndex = j;
                }else if (currentMinRow == m[j][0] && currentMinCol > m[j][1]){
                    currentMinCol = m[j][1];
                    currentMinIndex = j;
                }

            }
            if(currentMinIndex != i){
                m[currentMinIndex][0] = m[i][0];
                m[i][0] =currentMinRow;
                m[currentMinIndex][1] = m[i][1];
                m[i][1] = currentMinCol;

            }

        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
        }

    }
}
