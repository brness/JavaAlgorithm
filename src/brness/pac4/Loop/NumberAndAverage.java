package brness.pac4.Loop;

import java.util.Scanner;

public class NumberAndAverage {
    public static void main(String[] args) {
        System.out.println("Enter the number(0 ends): ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int neg=0;
        int pos=0;
        if(x<0)
            neg++;
        else if(x>0)
            pos++;
        int sum=0;
        while(x!=0){
            sum=sum+x;
            x=s.nextInt();
            if(x<0)
                neg++;
            else if(x>0)
                pos++;
        }
        System.out.println("The number of positives is :"+pos);
        System.out.println("The number of negatives is :"+neg);
        System.out.println("The total is :"+sum);
        System.out.println("The average is :"+(double)sum/(pos+neg));

    }
}
