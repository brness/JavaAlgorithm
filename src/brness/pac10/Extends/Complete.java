package brness.pac10.Extends;

import java.util.ArrayList;
import java.util.Scanner;

public class Complete {
    public static void main(String[] args) {
        System.out.println("Enter an integer m:");
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int p=m;
        ArrayList<Integer> list=new ArrayList<>();
        int i=2;
        while (m>=i){
            if(m%i==0){
                if(!list.contains(i))
                    list.add(i);
                else list.remove(list.indexOf(i));
                m=m/i;
            }
            else i++;
        }
        int n=1;
        for(int j=0;j<list.size();j++){
            n=list.get(j)*n;
        }
        System.out.println("The smallest number n for m*n to be a perfect square is "+n);
        System.out.println("M*N is "+p*n);
    }
}
