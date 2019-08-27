package brness.pac2.selection;

import java.util.Scanner;

public class DaysOfAMonth {
    public static void main(String[] args){
        System.out.println("Enter the year: ");
        System.out.println("Enter the Month: ");
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        int month=s.nextInt();

        if((year%4==0&&year%100!=0)||(year%400==0)){
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:System.out.println(year+"year"+month+"month has 31 days");break;
                case 4:
                case 6:
                case 9:
                case 11:System.out.println(year+"year"+month+"month has 30 days");break;
                default:
                    System.out.println(year+"year"+month+"month has 29 days");break;
            }
        }
        else
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:System.out.println(year+"year"+month+"month has 31 days");break;
                case 4:
                case 6:
                case 9:
                case 11:System.out.println(year+"year"+month+"month has 30 days");break;
                default:
                    System.out.println(year+"year"+month+"month has 28 days");break;
            }
    }
}
