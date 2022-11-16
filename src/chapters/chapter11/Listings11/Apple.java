package chapters.chapter11.Listings11;

public class Apple extends Fruit{
    public static void main(String[] args) {
        new Apple();
    }

    public Apple(){
        super("a");
    }


}
class Fruit{
    public Fruit(String name){
        System.out.println("Fruit's constructor is invoked");
    }
}
