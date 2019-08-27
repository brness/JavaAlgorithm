package brness.pac22.SetAndMap;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UpdateKeyWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the java source file:");
        String filename=input.nextLine();
        File file=new File(filename);
        if(file.exists()){
            System.out.println("The number of key words is "+countwords(file));
        }
        else
            System.out.println("The file doesn't exist!");
    }

    public static int countwords(File file){
        String[] keywords={"abstract","assert","boolean","class","int","double","long","String",
                "float","char","byte"};
        int count=0;
        Set<String> keys=new HashSet<String>(Arrays.asList(keywords));
        try {
            Scanner s = new Scanner(new FileInputStream(file));
            while (s.hasNext()) {
                String line = s.nextLine();
                line=StripComment(line);
                line=StripLine(line);
                for (String word:keys)
                    if (line.contains(word))
                        count++;
            }
            s.close();
        }catch (Exception e){}
        return count;
    }

    public static String StripComment(String s){
        int start=s.indexOf("\"");
        int end=s.indexOf("\"",start+1);

        while (start>0&&end>0){
            s=s.substring(0,start)+s.substring(end+1);
            start=s.indexOf("\"");
            end=s.indexOf("\"",start+1);
        }
        return s;
    }

    public static String StripLine(String s){
        int line=s.indexOf("//");
        if (line<0)
            return s;
        else return s.substring(0,line);
    }
}
