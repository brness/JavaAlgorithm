package brness.pac23.Complexity;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSubString {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner s=new Scanner(System.in);
        String line=s.nextLine();
        ArrayList<Character> list=new ArrayList<>();
        list.add(line.charAt(0));
        int i=0;
        for (int j=1;j<line.length();j++){
            if (line.charAt(j)>=line.charAt(j-1)) {
                i=j;
                list.add(line.charAt(j));
            }
        }
        System.out.println("The max Sub String is "+list);
    }
}
