package weeks.week_15;

public class Lion {
    private int tailSize;
    private double weight;
    private double height;
    private boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;
    Lion(){

    }
    Lion(int tailSize,double weight,double height,boolean hasSwimmingSkills,boolean hasFlyingSkills){
        this.tailSize = tailSize;
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public void runs(){
        System.out.println("Lion is running");
    }
    public void eats(){
        System.out.println("Lion is eating");
    }
    public void sleeps(){
        System.out.println("Lion is sleeping");
    }
    public void roar(){
        System.out.println("Lion is roaring");
    }
    public int isTail() {
        return tailSize;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }
}
