package brness.pac18.BinaryIO;

import java.io.*;

public class SumOfBinary {
    public static void main(String[] args) throws IOException{
        DataOutputStream out=new DataOutputStream(new FileOutputStream("sum.dat"));
        for(int i=0;i<100;i++){
            out.writeInt(i);
        }
        out.close();

        DataInputStream in=new DataInputStream(new FileInputStream("sum.dat"));
        int sum=0;
        while (in.available()!=0){
            sum+=in.readInt();
        }
        System.out.println("The sum of the file is "+sum);
    }
}
