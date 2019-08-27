package brness.pac18.BinaryIO;

import java.io.*;

public class TestObjectStreamForArray {
    public static void main(String[] args) throws ClassNotFoundException,IOException{
        int[] numbers={1,2,3,4,5};
        String[] strings={"John","Susan","Kim"};
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("array.dat",true));
        objectOutputStream.writeObject(numbers);
        objectOutputStream.writeObject(strings);
        objectOutputStream.close();

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("array.dat"));
        int[] newnumber=(int[])objectInputStream.readObject();
        String[] newString=(String[])objectInputStream.readObject();

        for(int i=0;i<newnumber.length;i++){
            System.out.println(newnumber[i]);
        }
        for(int i=0;i<newString.length;i++){
            System.out.println(newString[i]);
        }
    }
}
