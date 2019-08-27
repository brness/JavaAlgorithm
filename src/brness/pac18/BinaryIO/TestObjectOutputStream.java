package brness.pac18.BinaryIO;

import java.io.*;
import java.util.Date;

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("object.txt"));
        objectOutputStream.writeUTF("John");
        objectOutputStream.writeDouble(83.5);
        objectOutputStream.writeObject(new Date());
        objectOutputStream.close();

        ObjectInputStream objectInputStream=new ObjectInputStream(new BufferedInputStream(new FileInputStream("object.txt")));
        while (objectInputStream.available()!=0){
            System.out.print(objectInputStream.readUTF()+" ");
            System.out.print(objectInputStream.readDouble()+" ");
            System.out.print(objectInputStream.readObject());
        }
        objectInputStream.close();
    }
}
