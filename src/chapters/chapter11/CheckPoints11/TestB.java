package chapters.chapter11.CheckPoints11;

public class TestB {
    public static void main(String[] args) {
        C c = new C();
            c.r(10);
            c.r(10.0);

    }
}
class D{
    public void r(double i){
        System.out.println(i * 2);
    }
}

class C extends D{
    public void r(int i){
        System.out.println(i);
    }
}
