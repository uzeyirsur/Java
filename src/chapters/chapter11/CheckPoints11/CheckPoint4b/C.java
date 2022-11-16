package chapters.chapter11.CheckPoints11.CheckPoint4b;
class A{
    public A(int x){
        System.out.println(x);
    }
}
class B extends A{
    public B(){
        super(2);

    }
}
public class C {
    public static void main(String[] args) {
        B b = new B();
    }
}
