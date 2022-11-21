package chapters.chapter10.Exercises10.Exercise14;

import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate(){
        this(System.currentTimeMillis());
    }
    MyDate(long elapsedTime){
setDate(elapsedTime);
    }
    MyDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        month = calendar.get(GregorianCalendar.MONTH);
        year = calendar.get(GregorianCalendar.YEAR);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
