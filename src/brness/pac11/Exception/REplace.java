package brness.pac11.Exception;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class REplace {
    public static void main(String[] args) throws Exception{
        if(args.length!=3){
            System.out.println("Usage: file oldString newString");
            System.exit(1);
        }
        File file=new File(args[0]);
        if(!file.exists()){
            System.out.println("The file doesn't exist");
            System.exit(2);
        }
        Scanner input=new Scanner(file);
        ArrayList<String> list=new ArrayList<>();
        while (input.hasNext()){
            String s=input.nextLine();
            String s1=s.replaceAll(args[1],args[2]);
            list.add(s1);
        }
        input.close();

        PrintWriter output=new PrintWriter(file);
        output.println(list.toString());
        output.close();
    }
}
