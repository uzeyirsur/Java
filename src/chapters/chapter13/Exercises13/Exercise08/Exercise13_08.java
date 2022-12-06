package chapters.chapter13.Exercises13.Exercise08;

public class Exercise13_08 {
    public static void main(String[] args) throws CloneNotSupportedException{
        MyStack myStack =new MyStack();
        myStack.push(12);
        myStack.push(23);
        MyStack myStack1 =(MyStack) myStack.clone();
        System.out.println("myStack: "+ myStack);
        System.out.println("myStack1: " + myStack1);

        System.out.println(myStack1 == myStack);

    }
}
