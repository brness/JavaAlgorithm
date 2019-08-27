package brness.pac18.BinaryIO;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException{
        if(args.length!=2){
            System.out.println("Usage: java Copy source target");
            System.exit(1);
        }
        File source=new File(args[0]);
        if(!source.exists()){
            System.out.println("Source File doesn't exist");
            System.exit(2);
        }
        File target=new File(args[1]);
        if(target.exists()){
            System.out.println("Target File already exist");
            System.exit(3);
        }

        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(target));

        while (bufferedInputStream.available()!=0){
            bufferedOutputStream.write(bufferedInputStream.read());
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
