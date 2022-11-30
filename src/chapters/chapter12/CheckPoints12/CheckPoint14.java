
package chapters.chapter12.CheckPoints12;

public class CheckPoint14 {
    public static void main(String[] args) {
        try{
            int[] list = new int[10];
            System.out.println("list[10] is " + list[10]);
        }catch(ArithmeticException ex){
            System.out.println("ArithmeticException");
        }catch(RuntimeException ex){
            System.out.println("RunTimeException");
        }catch(Exception ex){
            System.out.println("Exception");
        }
    }
}
