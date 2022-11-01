package chapters.chapter09.CheckPoints09;

public class C {
    private int p;
    public C(){
        System.out.println("C's no-arg constructor invoked");
        //this(0); this keyword must be the first statement.
    }
    public C(int p){
        //p = p; this keyword must be used with p variable to reveal the hidden data field.
    }
    public void setP(int p){
       //p = p; this keyword must be used with p variable to reveal the hidden data field.
    }
}
