package brness.pac11.Exception;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Scores {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter the name of the file");
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        File file=new File(name);
        if(!file.exists()) {
            System.out.println("The File doesn't exist");
            System.exit(1);
        }
        Scanner s1=new Scanner(file);

        ArrayList<Double> list=new ArrayList<>();

        int number=0;
        double sum=0;
        while (s1.hasNext()){
            list.add(s1.nextDouble());
        }
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
            number++;
        }
        s1.close();

        System.out.println("The sum of the file is "+sum);
        System.out.println("The average of the file is "+sum/number);
    }

}
