package chapters.chapter10.Exercises.Exercise03;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return (this.value % 2 == 0);
    }

    public boolean isOdd() {
        return (this.value % 2 != 0);
    }

    public boolean isPrime() {
        for (int i = 2; i < value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int newValue) {
        return newValue % 2 == 0;
    }

    public static boolean isOdd(int newValue) {
        return newValue % 2 != 0;
    }

    public static boolean isPrime(int newValue) {
        for (int i = 2; i < newValue / 2; i++) {
            if (newValue % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int newValue) {
        return this.value == newValue;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.getValue();
    }

    public static int parseInt(char[] chars) {
        String s = String.valueOf(chars);
        return Integer.parseInt(s);
    }
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }
}
