package brness.pac9.TheThinkingOfObject;

import java.util.Scanner;
/*
StringBuilder里面自带reverse方法，所以可以直接调用
 */
public class PalindromeIgnoreAlphanumeric {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String t=s.nextLine();

        System.out.println("Ignoring nonalphanumeric characters, \nis"+t+" a Palindrome?"+isPalindrome(t));
    }

    public static boolean isPalindrome(String s){
        String s1=filter(s);

        String s2=reverse(s1);//使用的是StringBuilder自带的方法，返回值。toString

        return s1.equals(s2);
    }

    public static String filter(String s){
        StringBuilder stringbuilder=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                stringbuilder.append(s.charAt(i));
            }
        }
        return stringbuilder.toString();
    }

    public static String reverse(String s){
        StringBuilder stringBuilder=new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }
}
