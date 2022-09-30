package chapters.chapter06.CheckPoints_06;

public class CheckPoint_06_13b {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6){
            method1(i, 2);
            i++;
        }
    }
    public static void method1(int i , int num){
        for (int j = 1; j <= i; j++) {
            System.out.println(num + " ");
            num *= 2;
        }
        System.out.println();
    }

}
