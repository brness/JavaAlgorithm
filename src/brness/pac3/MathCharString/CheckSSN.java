package brness.pac3.MathCharString;

import java.util.Scanner;

public class CheckSSN {
    public static void main(String[] args){
        System.out.println("Enter a SSN: ");
        Scanner s=new Scanner(System.in);
        String SSN=s.nextLine();
        String s1=SSN.substring(0,3);
        String s2=SSN.substring(4,6);
        String s3=SSN.substring(7,11);
        if(s1.charAt(0)>='0'&&s1.charAt(0)<='9'){
            if(s1.charAt(1)>='0'&&s1.charAt(1)<='9'){
                if(s1.charAt(2)>='0'&&s1.charAt(2)<='9'){
                    if(s2.charAt(0)>='0'&&s2.charAt(0)<='9'){
                        if(s2.charAt(1)>='0'&&s2.charAt(1)<='9'){
                            if(s3.charAt(0)>='0'&&s3.charAt(0)<='9'){
                                if(s3.charAt(1)>='0'&&s3.charAt(1)<='9'){
                                    if(s3.charAt(2)>='0'&&s3.charAt(2)<='9'){
                                        if(s3.charAt(3)>='0'&&s3.charAt(3)<='9')
                                            System.out.println(SSN+" is a valid social security number");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else
            System.out.println(SSN+" is not a valid social security number");
    }
}
