package brness.pac11.Exception;

import brness.pac5.Method.SimpleCalendar;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws Exception{
        if(args.length!=4){
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        File sourcefile=new File(args[0]);
        if(!sourcefile.exists()){
            System.out.println("SourceFile "+args[0]+" do not exist");
            System.exit(2);
        }
        File targetFile=new File(args[1]);
        if(targetFile.exists()){
            System.out.println("TargetFile "+args[1]+" already exist");
            System.exit(3);
        }

        Scanner input=new Scanner(sourcefile);
        PrintWriter output=new PrintWriter(targetFile);

        while(input.hasNext()){
            String s1=input.nextLine();
            String s2=s1.replaceAll(args[2],args[3]);
            output.println(s2);
        }

        input.close();
        output.close();
    }
}
