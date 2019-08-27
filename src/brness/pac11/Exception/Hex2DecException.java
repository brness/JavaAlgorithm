package brness.pac11.Exception;

import java.util.Scanner;

public class Hex2DecException {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a hex number");

        String hex=s.nextLine();
        System.out.println("The decimal value of the "+hex+" is "+hextoDecimal(hex.toUpperCase()));
    }

    public static int hextoDecimal(String hex){
        int decimalValue=0;
        try {
            for (int i = 0; i < hex.length(); i++) {
                char hexChar = hex.charAt(i);
                decimalValue = decimalValue * 16 + hexChartoDecimal(hexChar);
            }

        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        return decimalValue;
    }

    public static int hexChartoDecimal(char ch){
        if(ch>='A'&&ch<='F')
            return 10+ch-'A';
        if(ch>='0'&&ch<='9')
            return ch-'0';
        else throw new NumberFormatException("Number format error!");
    }
}
