package brness.pac2.selection;

import java.util.Scanner;

public class Today {
    public static void main(String[] args){
        System.out.println("Enter the year: ");
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        System.out.println("Enter the month: ");
        int month=s.nextInt();
        System.out.println("Enter the day: ");
        int day=s.nextInt();

        int h=0;
        if(month==1||month==2){
            h=(int)(day+26*(month+12+1)/10+(year-1)%100*1.25+Math.abs((year-1)/100)*5.25)%7;
        }
        else
            h=(int)(day+26*(month+1)/10+year%100*1.25+Math.abs(year/100)*5.25)%7;

        switch (h){
            case 1:System.out.println("Day of the week is Sunday");break;
            case 2:System.out.println("Day of the week is Monday");break;
            case 3:System.out.println("Day of the week is Tuesday");break;
            case 4:System.out.println("Day of the week is Wednesday");break;
            case 5:System.out.println("Day of the week is Thursday");break;
            case 6:System.out.println("Day of the week is Friday");break;
            default:
                System.out.println("Day of the week is Saturday");break;

        }
    }
}
