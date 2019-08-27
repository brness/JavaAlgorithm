package brness.pac18.BinaryIO;

import java.io.*;

public class TextIO {
    public static void main(String[] args) throws IOException{
        PrintWriter file=new PrintWriter(new FileOutputStream("t2.txt"));
        for(int i=0;i<100;i++){
            file.print((int)(Math.random()*10000));
            file.print(" ");
        }
        file.close();
    }
}
