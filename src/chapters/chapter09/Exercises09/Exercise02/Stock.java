
package chapters.chapter09.Exercises09.Exercise02;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public Stock(String newSymbol,String newName){
        symbol = newSymbol;
        name = newName;
    }
    public double getChangePercent(double previousClosingPrice,double currentPrice){
        return ((previousClosingPrice - currentPrice) / previousClosingPrice) * 100;
    }
}
