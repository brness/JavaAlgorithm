package brness.pac24.Sort;

import java.io.*;

public class CreateLargeFile {
    public static void main(String[] args) throws Exception{
        DataOutputStream data=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("largedata.dat")));
        for (int i=0;i<80004;i++){
            data.writeInt((int)(Math.random()*1000000));
        }
        data.close();

        DataInputStream input=new DataInputStream(new BufferedInputStream(new FileInputStream("largedata.dat")));
        for (int i=0;i<100;i++){
            System.out.print(input.readInt()+" ");
        }
        input.close();
    }
}
