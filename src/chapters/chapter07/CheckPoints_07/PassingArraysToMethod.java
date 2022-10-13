package chapters.chapter07.CheckPoints_07;

public class PassingArraysToMethod {
    public static void main(String[] args) {
        int x = 1;
        int [] y = new int[10];
        m(x,y);
        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
    }
    public static void m (int number, int[] numbers){
        number = 1001;
        numbers[0] = 5555;

    }
}
