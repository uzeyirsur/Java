
package chapters.chapter06.Exercises_06;

public class Exercise_06_11 {
    public static void main(String[] args) {
        System.out.println(computeCommission(-1000));
    }

    public static double computeCommission(double salesAmount) {
        double commission = 0;
        if(salesAmount < 0){
            System.out.println("invalid input");
        }
        else if (salesAmount <= 5000) {
            commission = salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        }else {
            commission = 5000 * 0.08 + (5000 * 0.10) + (salesAmount - 10000) * 0.12;
        }

        return commission;
    }
}
