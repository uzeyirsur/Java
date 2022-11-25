package chapters.chapter12.Exercises12.Exercise05;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        super("Illegal triangle!");
    }
    public IllegalTriangleException(String message){
        super(message);
    }
}
