package brness.pac11.Exception;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrderedOrNot {
    public static void main(String[] args) throws Exception{
        File file=new File("SortedStrings.txt");
        Scanner input=new Scanner(file);
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> temp=new ArrayList<>();
        while (input.hasNext()){
            String s=input.nextLine();
            list.add(s);
        }
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).compareTo(list.get(i+1))>0) {
                System.out.println("The String is not in accent order!");
                System.out.println(list.get(i));
                System.out.println(list.get(i+1));
                break;
            }
        }

        input.close();
    }
}
