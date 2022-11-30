
package chapters.chapter07.CheckPoints_07;

public class CheckPoint_07_13 {
    public static void main(String[] args) {
        int[] source = {3, 4, 5};
        int[] t = new int[source.length];
        System.arraycopy(source, 0, t, 0, source.length);
        for (int e : t) {
            System.out.print(e + " ");
        }
    }
}
