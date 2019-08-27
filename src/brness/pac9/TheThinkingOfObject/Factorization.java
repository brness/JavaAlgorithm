package brness.pac9.TheThinkingOfObject;

import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int i=2;
        StackOfInteger m=new StackOfInteger(16);
        while (i<=x){//因式分解 这里用的式只要因子小于x就继续
            if(x%i==0){
                m.push(i);
                x=x/i;
            }
            else
                i++;
        }
        while(!m.empty()){
            System.out.print(m.pop());
        }
    }
}
