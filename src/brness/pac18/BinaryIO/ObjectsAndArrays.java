package brness.pac18.BinaryIO;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class ObjectsAndArrays {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ObjectAndArrays.dat")));
        int[] a={1,2,3,4,5};
        double b=5.5;
        objectOutputStream.writeObject(new Date());
        objectOutputStream.writeDouble(b);
        objectOutputStream.writeObject(a);
        objectOutputStream.close();

        ObjectInputStream objectInputStream=new ObjectInputStream(new BufferedInputStream(new FileInputStream("ObjectAndArrays.dat")));
        Date t=(Date)objectInputStream.readObject();
        System.out.println(t);
        System.out.println(objectInputStream.readDouble());
        int[] newa=(int[])objectInputStream.readObject();
        System.out.println(Arrays.toString(newa));
        objectInputStream.close();
    }
}
