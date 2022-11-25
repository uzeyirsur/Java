package chapters.chapter12.Exercises12.Exercise10;

public class Exercise12_10 {
    public static void main(String[] args) {
        try{
            int[] arr = new int[1000000000 *100000000];
        }catch (OutOfMemoryError ex){
            System.out.println("OutOfMemoryError: " + ex);
        }
    }
}
