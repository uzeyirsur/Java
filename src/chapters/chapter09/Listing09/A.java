package chapters.chapter09.Listing09;

public class A {
    int i = 5;
    static int k = 2;

    public static void main(String[] args){
        A a = new A();
        int j = a.i;
     a.m1();
    }
    public void m1(){
        i =i + k +m2(i,k);
    }
    public static int m2(int i ,int j ){
        return (int)(Math.pow(i,j));
    }
}
