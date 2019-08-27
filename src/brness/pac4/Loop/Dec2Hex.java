package brness.pac4.Loop;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        System.out.println("Enter a decimal number: ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        String s1="";
        while(x!=0){
            int hexvalue=x%16;

            char hex=(hexvalue<=9&&hexvalue>=0)?(char)(hexvalue+'0'):(char)(hexvalue+'A'-10);

            s1=hex+s1;//用字符串向前面追加字符

            x=x/16;
        }
        System.out.println("the hex formation of "+x+" is "+s1);
    }
}
