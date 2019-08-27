package brness.pac12.Abstract;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar=new GregorianCalendar();
        System.out.println("Current time is "+new Date());
        System.out.println("Year: "+calendar.get(Calendar.YEAR));
        System.out.println("Month: "+(calendar.get(Calendar.MONTH)+1)) ;
        System.out.println("Date: "+calendar.get(Calendar.DATE));
        System.out.println("Hour: "+calendar.get(Calendar.HOUR));
        System.out.println("Hour-Of-Day: "+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: "+calendar.get(Calendar.MINUTE));
        System.out.println("Second: "+calendar.get(Calendar.SECOND));

        Calendar calendar1=new GregorianCalendar(2001,8,11);
        String[] dayNameOfWeek={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("September 11,2001 is a "+dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK)-1]);
    }
}
