package brness.pac11.Exception;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Rank {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter the year:");
        Scanner s=new Scanner(System.in);
        String year=s.nextLine();
        System.out.println("Enter the gender: ");
        String gender=s.nextLine();
        System.out.println("Enter the name:");
        String name=s.nextLine();

        ArrayList<String> boys=new ArrayList<>();
        ArrayList<String> girls=new ArrayList<>();

        File file=new File("Babynamesranking"+year+".txt");
        Scanner input=new Scanner(file);
        while (input.hasNext()){
            String s1=input.nextLine();
            String[] s2=s1.split("[\\t\\n\\r]");
            boys.add(s2[1]);
            girls.add(s2[3]);
        }
        input.close();

        if(gender.equals("M")){
            if(boys.contains(name))
                System.out.println(name+" is ranked #"+(boys.indexOf(name)+1)+" in the year "+year);
            else
                System.out.println(name+" is not in the list");
        }
        else if(gender.equals("F")){
            if(girls.contains(name))
                System.out.println(name+" is ranked #"+(girls.indexOf(name)+1)+" in the year "+year);
            else
                System.out.println(name+" is not in the list");
        }
    }
}
