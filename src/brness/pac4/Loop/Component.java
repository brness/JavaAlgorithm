package brness.pac4.Loop;

import java.util.Scanner;

public class Component {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int i=2;
        while(x!=1){
            if(x%i==0){
                x=x/i;
                System.out.println(i);
            }
            else
                i++;
        }
    }
}
