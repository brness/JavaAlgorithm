package brness.pac11.Exception;

import java.io.File;
import java.io.PrintWriter;

public class CreateBigData {
    public static void main(String[] args) throws Exception{
        File file=new File("Salary.txt");
        if(file.exists()){
            System.out.println("The file already exists!");
            System.exit(1);
        }
        PrintWriter output=new PrintWriter(file);
        int i=0;
        char[] name=new char[26];
        for(int j=0;j<26;j++){
            name[j]=(char)('A'+j);
        }
        int random=(int)(Math.random()*26);

        String[] title={"assistant","associate","full"};
        int Nrandom=(int)(Math.random()*3);

        int AssiSalary=(int)(Math.random()*30000)+50000;
        int AssoSalary=(int)(Math.random()*50000)+60000;
        int fullSalary=(int)(Math.random()*55000)+75000;
        while (i<1000){
            output.print(name[random]+" ");
            output.print(name[random]+" ");
            output.print(title[Nrandom]+" ");
            switch (Nrandom){
                case 0:output.println(AssiSalary);
                break;
                case 1:output.println(AssoSalary);
                break;
                default:output.println(fullSalary);
                break;
            }
            i++;
            random=(int)(Math.random()*26);
            Nrandom=(int)(Math.random()*3);
            AssiSalary=(int)(Math.random()*30000)+50000;
            AssoSalary=(int)(Math.random()*50000)+60000;
            fullSalary=(int)(Math.random()*55000)+75000;
        }
        output.close();
    }
}
