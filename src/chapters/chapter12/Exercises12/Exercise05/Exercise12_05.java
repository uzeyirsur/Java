package chapters.chapter12.Exercises12.Exercise05;

public class Exercise12_05 {
    public static void main(String[] args) {
       try{
           Triangle triangle = new Triangle(1,2,3);
       }catch(IllegalTriangleException ex){
           System.out.println(ex.getMessage());
       }
    }
}
