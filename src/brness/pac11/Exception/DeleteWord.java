package brness.pac11.Exception;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteWord {
    public static void main(String[] args) throws Exception {
        if(args.length!=2){
            System.out.println("Usage: java Exercise John filename");
        }

        File sourcefile=new File(args[1]);
        Scanner s=new Scanner(sourcefile);

        ArrayList<String> list=new ArrayList<>();
        boolean firstline=true;
        String LineSeparator=System.getProperty("line.separator");
        while(s.hasNext()){
            String input=s.nextLine();
            String s1=input.replaceAll(args[0],"");
            if(firstline){
                list.add(s1);
            }
            else
                list.add(LineSeparator+s1);
        }

        s.close();

        PrintWriter output=new PrintWriter(sourcefile);
        output.print(list.toString());
        output.close();
    }
}
