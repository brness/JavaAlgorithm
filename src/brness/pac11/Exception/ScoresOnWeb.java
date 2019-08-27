package brness.pac11.Exception;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class ScoresOnWeb {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter the URL of the Web:");
        Scanner s=new Scanner(System.in);
        String u=s.nextLine();
        URL url=new URL(u);

        Scanner input=new Scanner(url.openStream());
        ArrayList<Double> list=new ArrayList<>();
        while (input.hasNext()){
            double score=input.nextDouble();
            list.add(score);
        }

        double sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }

        input.close();
        System.out.println("The sum of the Web is "+sum);
        System.out.println("The average of the Web is "+sum/list.size());
    }
}
