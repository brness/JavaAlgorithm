package brness.pac24.Sort;

import java.io.*;
import java.util.Arrays;

public class CreateOrderedSegments {
    public static void main(String[] args) {

    }

    //将一个无序的文件分成以numberSegments个有序部分的文件
    private static int initializeSegments(int segmentSize,String originalFile,String f1) throws Exception{
        int[] list=new int[segmentSize];
        DataInputStream input=new DataInputStream(new BufferedInputStream(new FileInputStream(originalFile)));
        DataOutputStream output=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f1)));

        int numberSegments=0;
        while (input.available()>0){
            numberSegments++;
            int i=0;
            for (;input.available()>0&&i<segmentSize;i++)
                list[i]=input.readInt();
            Arrays.sort(list);

            for (int j=0;j<i;j++)
                output.writeInt(list[i]);
        }

        input.close();
        output.close();

        return numberSegments;
    }

    private static void copyHalf(int numberSegments,String f1,String f2,int segmentSize) throws Exception{
        DataInputStream input=new DataInputStream(new BufferedInputStream(new FileInputStream(f1)));
        DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f2)));
        for (int i=0;i<(numberSegments/2)*segmentSize;i++){
            out.writeInt(input.readInt());
        }
        input.close();
        out.close();
    }
}
