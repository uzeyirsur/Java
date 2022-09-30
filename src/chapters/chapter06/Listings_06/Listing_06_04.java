package chapters.chapter06.Listings_06;

public class Listing_06_04 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call, x is " + x);
    }
    public static void increment (int n){
        n++;
        System.out.println("n inside the method is " + n);
    }
}
