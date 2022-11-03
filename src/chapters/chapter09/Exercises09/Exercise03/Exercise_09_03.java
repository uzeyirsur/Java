package chapters.chapter09.Exercises09.Exercise03;

import java.util.Date;

public class Exercise_09_03 {
    public static void main(String[] args) {
      long startElapsedNum = 10_000;
      long endElapsedNum = 100_000_000_000L;
        Date date = new Date();
        for (long i = startElapsedNum; i < endElapsedNum; i *= 10) {
           date.setTime(i);
            System.out.println(date.toString());
        }

    }



}
