package brness.pac21.DataStructure;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortAlf {
    public static void main(String[] args) throws IOException{
        if(args.length!=1){
            System.out.println("Usage: java SortAlf name.txt");
            System.exit(1);
        }
        File file=new File(args[0]);
        if (!file.exists()){
            System.out.println("The file doesn't exist");
        }
        Scanner input=new Scanner(file);
        ArrayList<String> list=new ArrayList<>();
        while (input.hasNext()){
            list.add(input.next());
        }
        input.close();
//        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
