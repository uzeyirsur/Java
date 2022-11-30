
package chapters.chapter06.CheckPoints_06;

public class CheckPoint_06_10 {
    public static void main(String[] args)
    {
double result = method (1,10);
        System.out.println(result);
    }


    public static double method(double i, double j)
    {
        while (i < j) {
            j--;
        }
        return j;
    }
}
