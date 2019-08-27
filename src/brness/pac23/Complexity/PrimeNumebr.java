package brness.pac23.Complexity;

import java.util.Scanner;

public class PrimeNumebr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Find All prime numbers <=n,enter n: ");
        int n=s.nextInt();
        final int NUMBER_PER_LINE=10;
        int count=0;
        int number=2;
        System.out.println("The prime numbers are: ");
        while (n>=number){
            boolean isPrime=true;
            for(int k=2;k<=Math.sqrt(n);k++){
                if (n%k==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                count++;
                System.out.print(n+" ");
                if (count%NUMBER_PER_LINE==0){
                    System.out.println();
                }
            }
            n--;
        }
        System.out.println("The prime number counts are "+count);
    }
}
