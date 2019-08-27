package brness.pac18.BinaryIO;

import java.io.*;

public class DetectEndOfFile {
    public static void main(String[] args) throws IOException{
        DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("test.dat"));
        dataOutputStream.writeDouble(4.5);
        dataOutputStream.writeDouble(43.25);
        dataOutputStream.writeDouble(3.2);

        dataOutputStream.close();
        FileInputStream fileInputStream=new FileInputStream("test.dat");
        DataInputStream dataInputStream=new DataInputStream(fileInputStream);
        while (dataInputStream.available()!=0)
            System.out.println(dataInputStream.readDouble());


    }
}
