package brness.pac11.Exception;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Statistic {
    public static void main(String[] args) throws Exception{
        if(args.length!=1){
            System.out.println("Usage :java Exercise Loan.java");
        }
        File file=new File(args[0]);
        if(!file.exists())
            System.out.println("The file does not exist");

        Scanner input=new Scanner(file);
        ArrayList<Integer> list=new ArrayList<>();
        int lines=0;
        int chara=0;
        int words=0;
        while (input.hasNext()){
            String s1=input.nextLine();
            lines++;
            for (int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=' ')
                    chara++;
            }
            words=words+CountWord(s1);
        }

        input.close();

        System.out.println("File "+file.getName()+" has");
        System.out.println(chara+" characters");
        System.out.println(words+" words");
        System.out.println(lines+" lines");
    }

    public static int CountWord(String s){
        String[] s1=s.split("[ \\t\\n\\r]");
        int count=0;
        for(int i=0;i<s1.length;i++){
            if(s1[i].length()>0)
                count++;
        }
        return count;


    }
}
