package brness.pac5.Method;

import java.util.Scanner;

public class Milliseconds {
    public static void main(String[] args) {
        System.out.println("Enter a million seconds: ");
        Scanner s=new Scanner(System.in);
        long x=s.nextLong();
        System.out.println(convertMillis(x));
    }

    public static String convertMillis(long x){
        int s=(int)(x/1000);
        int s1=s%60;
        int m=s/60;
        int m1=m%60;
        int h=m/60;
        String k=""+h+":"+m1+":"+s1;
        return k;
    }
}
