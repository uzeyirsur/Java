package chapters.chapter09.Exercises09.Exercise10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double newA,double newB,double newC){
        a= newA;
        b= newB;
        c= newC;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return (b * b) - (4 * a * c);
    }
    public double getRoot1(){
       if(getDiscriminant() < 0){
           return 0;
       }
        return ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
    }
    public double getRoot2(){
        if(getDiscriminant() < 0){
            return 0;
        }
        return ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
    }
}
