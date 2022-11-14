package weeks.week_15;

public class Animal {
    private double weight;
    private double height;
    private boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;

    Animal() {
        this.hasFlyingSkills = false;
        this.hasSwimmingSkills = false;
        this.weight = 0;
        this.height = 0;
    }

    Animal(double weight, double height, boolean hasSwimmingSkills, boolean hasFlyingSkills) {
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public void runs() {
    System.out.println("Animal running");
    }

    public void eats() {
    System.out.println("Animal eating.");
    }

    public void sleeps() {
    System.out.println("Animal sleeping.");
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

