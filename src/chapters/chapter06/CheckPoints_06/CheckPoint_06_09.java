
package chapters.chapter06.CheckPoints_06;

public class CheckPoint_06_09 {
    public static void main(String[] args) {
method1(1,2);
    }
    public static int method1 (int n, int m){
n += m;
 return method2(3);
    }
public static int method2 (int n){
        if (n > 0) {
            return 1;
        }else if  (n == 0){
            return 0;
        }else {
            return -1;
        }

}
}
