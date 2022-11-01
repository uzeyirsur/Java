package chapters.chapter09.CheckPoints09;

public class F {
    int i;
    static String s;
    void imethod(){
    }

    static void smethod(){
    }
public F(){

}
}
class TestF{
    public static void main(String[] args) {
        F f = new F();
        System.out.println(f.i);
        System.out.println(f.s);
        f.imethod();
        f.smethod();
        //System.out.println(F.i); Wrong.Because we cannot invoke instance variable using Class name.
        System.out.println(F.s);
        //F.imethod(); Wrong. Because we cannot invoke instance method using class name.
        F.smethod();
    }

}
