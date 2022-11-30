
package chapters.chapter07.CheckPoints_07;

public class CheckPoint_07_10 {
    public static void main(String[] args) {
        double[] r = new double[100];
        for (int i = 0; i < r.length; i++){
            r[i] = (int) (Math.random() * r.length);
        }
    }
}
