package brness.pac11.Exception;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException{
        File file=new File("score.txt");
        Scanner input=new Scanner(file);

        while (input.hasNext()){
            String firstname=input.next();
            String mi=input.next();
            String lastname=input.next();

            int score=input.nextInt();
            System.out.println(firstname+" "+mi+" "+lastname+" "+score);
        }
        input.close();
    }
}
