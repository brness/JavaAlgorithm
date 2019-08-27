package brness.pac18.BinaryIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIO {
    public static void main(String[] args) throws IOException{
        FileOutputStream fileOutputStream=new FileOutputStream("binary.dat",true);
        for (int i=0;i<100;i++){
            fileOutputStream.write((int)(Math.random()*101));
        }
        fileOutputStream.close();

        FileInputStream fileInputStream=new FileInputStream("binary.dat");
        int val;
        while ((val=fileInputStream.read())!=-1){
            System.out.print(val+" ");
        }
    }
}
