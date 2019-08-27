package brness.pac18.BinaryIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) throws IOException{
        FileOutputStream fileOutputStream=new FileOutputStream("temp.dat");
        for (int i=0;i<10;i++){
            fileOutputStream.write(i);
        }
        fileOutputStream.close();

        FileInputStream fileInputStream=new FileInputStream("temp.dat");
        int value;
        while((value=fileInputStream.read())!=-1)
            System.out.println(value+" ");
    }
}
