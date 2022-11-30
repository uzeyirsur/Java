
package chapters.chapter06.Exercises_06;

public class Exercise_06_08 {
    public static void main(String[] args) {
        System.out.printf("%-16s %-20s %-10s %-20s %1s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
        double celsius = 40;
        double fahrenheit = 120;
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-18.1f %-18.1f %-10s %-15.1f %10.2f\n", celsius, celsiusToFahrenheit(celsius), "|", fahrenheit, fahrenheitToCelsius(fahrenheit));
            celsius -= 1;
            fahrenheit -= 10;

        }

    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
