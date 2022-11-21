package chapters.chapter10.Exercises10.Exercise03;

public class Exercise10_03 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(13);
        System.out.println( myInteger.getValue() + " is \t\teven: " + myInteger.isEven() + "\t\todd: " + myInteger.isOdd() + "\t\tprime:" + myInteger.isPrime());

        System.out.println("14 is \t\teven: " + MyInteger.isEven(14) + "\t\todd: " + MyInteger.isOdd(14) + "\t\tprime: " + MyInteger.isPrime(14));

        System.out.println( myInteger.getValue() + " is \t\teven: " +  MyInteger.isEven(myInteger) + "\t\todd: " + MyInteger.isOdd(myInteger) + "\t\tprime: "+  MyInteger.isPrime(myInteger) );

        System.out.println("equals: " +  myInteger.equals(16));
        System.out.println("equals: " +myInteger.equals(myInteger) );

        System.out.println("char[] chars: " + MyInteger.parseInt(new char[] {'1','2','3'}));
        System.out.println("String s: " + MyInteger.parseInt("123"));



    }
}
