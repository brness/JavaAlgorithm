package brness.pac19.Recursive;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {
    public static void main(String[] args) {
        System.out.println("Enter a directory or file:");
        Scanner input=new Scanner(System.in);
        String directory=input.nextLine();

        System.out.println(getSize(new File(directory))+" bytes");
    }

    public static long getSize(File file){
        long size=0;

        if(file.isDirectory()){
            File[] files=file.listFiles();
            for(int i=0;files!=null&&i<file.length();i++){
                size+=getSize(files[i]);
            }
        }
        else
            size+=file.length();
        return size;
    }
}
