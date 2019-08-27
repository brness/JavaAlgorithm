package brness.pac11.Exception;

import brness.pac1.basic.Print;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Reformat {
    public static void main(String[] args) throws Exception{
        if(args.length!=1){
            System.out.println("Usage: java Exercise Test.java");
        }

        File file=new File(args[0]);
        if(!file.exists()){
            System.out.println("The file does not exist");
        }

        String lineseparator=System.getProperty("line.separator");
        Scanner input=new Scanner(file);
        ArrayList<String> list=new ArrayList<>();
        boolean firstl=true;
        while (input.hasNext()){
            String s1=input.nextLine();
            if (firstl) {
                firstl=false;
                list.add(s1);
            }
            else {
                if (s1.contains("{")) {
                    list.add(" {");
                }
                else
                    list.add(lineseparator+s1);
            }
        }
        input.close();

        PrintWriter output=new PrintWriter(file);
        output.print(list.toString());
        output.close();
    }
}
