package brness.pac5.Method;

import java.util.Scanner;

public class Passcode {
    public static void main(String[] args) {
        System.out.println("Enter a passcode: ");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        if(s1.length()>=8&&Contains(s1)&&TwoNum(s1))
            System.out.println("Valid Passcode");
        else
            System.out.println("Invalid Password");
    }

    public static boolean Contains(String s){
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)<='Z'&&s.charAt(i)>='A')||(s.charAt(i)<='z'&&s.charAt(i)>='a')
                    ||(s.charAt(i)<='9'&&s.charAt(i)>='0')){
            }
            else
                return false;
        }
        return true;
    }

    public static boolean TwoNum(String s){
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<='9'&&s.charAt(i)>='0')
                k++;
        }
        if(k>=2)
            return true;
        else
            return false;
    }
}
