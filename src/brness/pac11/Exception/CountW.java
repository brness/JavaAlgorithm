package brness.pac11.Exception;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.File;
import java.util.Scanner;

public class CountW {
    public static void main(String[] args) throws Exception{
        String name="Lincoln.txt";
        File file=new File(name);
        Scanner input=new Scanner(file);

        int word=0;
        while (input.hasNext()){
            String s=input.next();
            if(s.length()>0)
                word++;
        }
        input.close();

        System.out.println("The number of the file is "+word);
    }

}
