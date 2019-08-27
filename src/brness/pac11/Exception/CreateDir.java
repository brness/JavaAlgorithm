package brness.pac11.Exception;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

import java.io.File;
import java.util.Scanner;

public class CreateDir {
    public static void main(String[] args) throws Exception{
        Scanner s=new Scanner(System.in);
        String dir=s.nextLine();
        File file=new File(dir);
        if(file.mkdir())
            System.out.println("Directory created successfully");
        else {
            System.out.println("Directory already exists");
            System.exit(1);
        }
    }
}
