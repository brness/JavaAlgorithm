package brness.pac23.Complexity;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxConsequtiveSub {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner s=new Scanner(System.in);
        String line=s.nextLine();
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        list.add(i);
        for(int j=1;j<line.length();j++){
            if (line.charAt(j-1)>line.charAt(j)){
                i=j;
                list.add(i);
            }
            if (j==line.length()-1)
                list.add(j+1);
        }
        System.out.println(list);
        int l=0;
        int max=0;
        for (int k=1;k<list.size();k++){
            if (list.get(k)-list.get(k-1)>max){
                max=list.get(k)-list.get(k-1);
                l=k;
            }
        }
        System.out.println("The max SubString is "+line.substring(list.get(l-1),list.get(l)));
    }
}
