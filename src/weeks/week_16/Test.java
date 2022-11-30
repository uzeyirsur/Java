
package weeks.week_16;

public class Test {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        calculate.add(5);
        calculate.extract(2);
        calculate.multiply(2);
        System.out.println(calculate.getNumber());
        calculate.clear();
        System.out.println(calculate.getNumber());
        calculate.add(10);
        System.out.println(calculate);
    }
}
