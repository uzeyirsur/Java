package chapters.chapter09.Exercises09.Exercise02;

public class Exercise_09_02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        System.out.printf("The price change-percentage of " + stock.name + " is %2.2f", stock.getChangePercent(34.5, 34.35));
    }

}
