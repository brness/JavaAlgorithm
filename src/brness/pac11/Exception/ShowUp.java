package brness.pac11.Exception;

import java.io.File;
import java.util.Scanner;

public class ShowUp {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter the filename");
        Scanner s=new Scanner(System.in);
        String filename=s.nextLine();
        File file=new File(filename);

        int[] Upper=new int[26];
        int[] Lower=new int[26];
        Scanner input=new Scanner(file);
        while (input.hasNext()){
            String s1=input.nextLine();
            for (int i=0;i<s1.length();i++){
                if(s1.charAt(i)<='Z'&&s1.charAt(i)>='A'){
                    Upper[s1.charAt(i)-'A']++;
                }
                if(s1.charAt(i)<='z'&&s1.charAt(i)>='a'){
                    Lower[s1.charAt(i)-'a']++;
                }
            }
        }
        input.close();
        for(int i=0;i<26;i++){
            System.out.println("Number of "+(char)('A'+i)+" is "+Upper[i]);
            System.out.println("Number of "+(char)('a'+i)+" is "+Lower[i]);
        }
    }
}
