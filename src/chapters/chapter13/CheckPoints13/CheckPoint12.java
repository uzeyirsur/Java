package chapters.chapter13.CheckPoints13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CheckPoint12 {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
    }
}
