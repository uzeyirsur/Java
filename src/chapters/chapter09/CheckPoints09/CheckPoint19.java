
package chapters.chapter09.CheckPoints09;

import javafx.scene.shape.Circle;

public class CheckPoint19 {
    public static void main(String[] args) {
        //method1(); an instance method can not be invoked by static method.

    }
    public void method1(){
        method2();
    }
    public static void method2(){

        //System.out.println("What is radius " +  c.getRadius()); There is no object here.Because of this situation we cannot invoke getRadius method.
    }
    Circle c = new Circle();

}
