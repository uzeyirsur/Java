package chapters.chapter08.CheckPoints_08;

public class CheckPoint05 {
    public static void main(String[] args) {
        int[][] array = {{1,2}, {2,3},{5,6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length -1 ; j >= 0 ; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
