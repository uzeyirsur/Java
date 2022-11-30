
package chapters.chapter11.CheckPoints11.CheckPoint4a;

class A {
    public A() {
        System.out.println("A's no-arg constructor is invoked");
    }
}

class B extends A {
}


public class C {
    public static void main(String[] args) {
        B b = new B();
    }
}
