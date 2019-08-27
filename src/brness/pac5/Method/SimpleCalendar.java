package brness.pac5.Method;

import java.util.Scanner;

public class SimpleCalendar {
    public static void main(String[] args) {
        System.out.println("Enter the year: ");
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        System.out.println("Enter the month: ");
        int month=s.nextInt();
        printcalendar(year,month);
    }

    public static void printcalendar(int year,int month){
        System.out.println("Sat\tSun\tMon\tTue\tWed\tThu\tFri");
        int week=getDay(year,month);
        int day=getDays(year,month);
        for(int i=0;i<week;i++){
            System.out.print("   \t");
        }
        for(int i=1;i<=day;i++){
            System.out.print(i+"\t");
            if(i%7==(7-week))
                System.out.println();
        }
    }

    //判断某年某月的第一天是星期几
    public static int getDay(int year,int month){
        int h=0;
        if(month==1||month==2){
            h=(int)(1+26*(month+12+1)/10+(year-1)%100*1.25+Math.abs((year-1)/100)*5.25)%7;
        }
        else
            h=(int)(1+26*(month+1)/10+year%100*1.25+Math.abs(year/100)*5.25)%7;
        return h;
    }

    //判断这个月有多少天
    public static int getDays(int year,int month){
        if((year%4==0&&year%100!=0)||(year%400==0)){
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
                return 31;
            else if(month==2)
                return 29;
            else
                return 30;
        }
        else
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            return 31;
        else if(month==2)
            return 28;
        else
            return 30;
    }
}
