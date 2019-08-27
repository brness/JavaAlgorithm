package brness.pac22.SetAndMap;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountKeyWords {
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
                String line = s.next();
                if (keys.contains(line))
                    count++;
            }
            s.close();
        }catch (Exception e){}
        return count;
    }
}
