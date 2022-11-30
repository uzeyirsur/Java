
package chapters.chapter06.Exercises_06;

public class Exercise_06_09 {
    public static void main(String[] args) {
        System.out.printf("%-15s %-15s %-12s %-15s %s\n", "Feet", "Meters", "|", "Meters", "Feet" );
       double meters = 20;
        for (double feet = 1; feet <= 10; feet++){ //
            System.out.printf("%-15.1f %-15.3f %-12s %-15.1f %2.3f\n", feet, footToMeter(feet), "|",meters,  meterToFoot(meters)   ) ;
            meters += 5;
        }

    }


    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
}
