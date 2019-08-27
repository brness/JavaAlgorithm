package brness.pac18.BinaryIO;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException{
//        RandomAccessFile file=new RandomAccessFile("t1.txt","rw");
//        int[] number={1,2,3,4,5};
//        String[] string={"sda","dasd","asddas"};
//        file.write


//        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("object.dat"));
//        objectOutputStream.writeObject(new A());

//        PrintWriter printWriter=new PrintWriter("t.txt");
//        printWriter.printf("%s","1234");
//        printWriter.printf("%s","5678");
//        printWriter.close();
//
//
//        DataInputStream dataInputStream=new DataInputStream(new FileInputStream("t.txt"));
//        while(dataInputStream.available()!=0)
//            System.out.println(dataInputStream.readByte());
//        dataInputStream.close();
    }
}

class A implements  Serializable{
    B n=new B();
}
class B{}