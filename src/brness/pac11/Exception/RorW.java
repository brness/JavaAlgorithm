package brness.pac11.Exception;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RorW {
    public static void main(String[] args) throws Exception{
        String name="Exercise.txt";
        File file=new File(name);
        if(!file.exists()){
            PrintWriter output=new PrintWriter(file);
            for(int i=0;i<100;i++){
                output.print((int)(Math.random()*101)+" ");
                if((i+1)%10==0)
                    output.println();
            }

            output.close();
        }

        Scanner input=new Scanner(file);
        ArrayList<Integer> list=new ArrayList<>();
        while (input.hasNext()){
            list.add(input.nextInt());
        }
        input.close();

        Collections.sort(list);
        System.out.println(list);
    }
}
