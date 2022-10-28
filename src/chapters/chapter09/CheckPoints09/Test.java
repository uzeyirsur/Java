package chapters.chapter09.CheckPoints09;


public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}
    class A{
        String s;
        A(){     // There was no constructor with no arguments. Now I create one.
        }
        A(String newS){
            s = newS;
        }
        public void print(){
            System.out.println(s);
        }
    }

