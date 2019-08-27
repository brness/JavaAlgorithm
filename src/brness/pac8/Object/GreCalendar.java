package brness.pac8.Object;

import java.util.GregorianCalendar;

public class GreCalendar {
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.get(GregorianCalendar.YEAR)+"year"+gc.get(GregorianCalendar.MONTH)
                +"month"+gc.get(GregorianCalendar.DAY_OF_MONTH)+"day");
        gc.setTimeInMillis(1234567898765L);
        System.out.println(gc.get(GregorianCalendar.YEAR)+"year"+gc.get(GregorianCalendar.MONTH)
                +"month"+gc.get(GregorianCalendar.DAY_OF_MONTH)+"day");
    }
}
