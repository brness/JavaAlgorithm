package brness.pac2.selection;

import java.util.Scanner;

public class FutureDate {
    public static void main(String[] args){
        System.out.println("Enter today's day: ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");
        int y=s.nextInt();

        switch ((x+y)%7){
            case 0:System.out.println("Sunday");break;
            case 1:System.out.println("Monday");break;
            case 2:System.out.println("Tuesday");break;
            case 3:System.out.println("Wednesday");break;
            case 4:System.out.println("Thursday");break;
            case 5:System.out.println("Friday");break;
            default:
                System.out.println("Saturday");break;

        }
    }
}
