package weeks.week_16;

public class Calculator extends Number {
    public static final int ZERO = 0;

    public Calculator() {
    }

    public Calculator(double number) {
        super(number);
    }

    public double add(double number) {
        super.setNumber(getNumber() + number);
        return super.getNumber() + number;
    }

    public double extract(double number) {
        super.setNumber(getNumber() - number);
        return super.getNumber() - number;
    }

    public double multiply(double number) {
        super.setNumber(getNumber() * number);
        return super.getNumber() * number;
    }

    public double divide(double number) {
        super.setNumber(getNumber() / number);
        return super.getNumber() / number;
    }

    public void convertNegative() {
        setNumber(getNumber() * -1);
    }

    public void clear() {
        setNumber(ZERO);
    }
    @Override
    public String toString(){
        return "Result: " + getNumber();
    }
}
