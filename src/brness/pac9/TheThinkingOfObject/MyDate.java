package brness.pac9.TheThinkingOfObject;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(){
        GregorianCalendar date = new GregorianCalendar();
        // Find year, month, and day from date. You write your own code to replace the out-dated get methods
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH)+1;
        day = date.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedtime){
        setDate(elapsedtime);
    }

    public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(long elapesdTime){
        GregorianCalendar gc=new GregorianCalendar();
        gc.setTimeInMillis(elapesdTime);
        year=gc.get(GregorianCalendar.YEAR);
        month = gc.get(GregorianCalendar.MONTH)+1;
        day = gc.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
