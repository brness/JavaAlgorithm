package brness.pac11.Exception;

import java.io.IOException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.println("Enter a URL:");
        String URLString=new Scanner(System.in).next();

        try{
            URL url=new URL(URLString);
            int count=0;
            Scanner input=new Scanner(url.openStream());
            while(input.hasNext()){
                String line=input.nextLine();
                count+=line.length();
            }

            System.out.println("The size of the URL is "+count);
        }catch (MalformedURLException e){
            System.out.println("Invalid URL");
        }
        catch (IOException e){
            System.out.println("No Such file");
        }
    }
}
