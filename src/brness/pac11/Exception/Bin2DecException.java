package brness.pac11.Exception;

import java.util.Scanner;

public class Bin2DecException {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a hex number");

        String Bin=s.nextLine();
        System.out.println("The decimal value of the "+Bin+" is "+BintoDecimal(Bin));
    }

    public static int BintoDecimal(String bin){
        int decimalValue=0;
        try {
            for (int i = 0; i < bin.length(); i++) {
                char binChar = bin.charAt(i);
                decimalValue = decimalValue * 2 + binChartoDecimal(binChar);
            }

        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        return decimalValue;
    }

    public static int binChartoDecimal(char ch){
        if(ch<='1'&&ch>='0'){
            return ch-'0';
        }
        else throw new NumberFormatException("Number format error!");
    }
}
