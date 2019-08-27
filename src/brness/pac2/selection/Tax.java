package brness.pac2.selection;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args){
        System.out.println("Enter your identification:1 Single ,2 Married ,3 Married Single ,4 HouseOwner");
        Scanner s=new Scanner(System.in);
        int status=s.nextInt();
        System.out.println("Enter your income: ");
        double income=s.nextDouble();

        double sum=0;
        if(status==1){
            if(income<8350)
                sum=8350*0.1;
            else if(income<33950)
                sum=8350*0.1+(income-8350)*0.15;
            else if(income<52250)
                sum=8350*0.1+(33950-8350)*0.15+(income-33950)*0.25;
            else if(income<171550)
                sum=8350*0.1+(33950-8350)*0.15+(52250-33950)*0.25+(income-52250)*0.28;
            else if(income<372950)
                sum=8350*0.1+(33950-8350)*0.15+(52250-33950)*0.25+(171550-52250)*0.28+(income-171550)*0.33;
            else
                sum=8350*0.1+(33950-8350)*0.15+(52250-33950)*0.25+(171550-52250)*0.28+(372950-171550)*0.33+(income-372950)*0.35;
        }

        System.out.println("The tax you will pay is :"+sum);
    }
}
