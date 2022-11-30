
package chapters.chapter12.Exercises12.Exercise01;

public class CalculatorWithException {
    public static void main(String[] args) {
        if (isNumeric(args)) {
            int result = 0;

            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '.':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;
            }
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
        }
    }
    public static boolean isNumeric(String[] args){


        try{
            Integer.parseInt(args[0]);

        }catch(NumberFormatException ex){
            System.out.println("Wrong input: " + args[0]);
            System.exit(0);
        }

        try{
            Integer.parseInt(args[2]);
        }catch (NumberFormatException ex){
            System.out.println("Wrong input: " + args[2]);
            System.exit(0);
        }
        return true;
    }
}
