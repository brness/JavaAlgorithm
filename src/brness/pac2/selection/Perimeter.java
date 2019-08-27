package brness.pac2.selection;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args){
        System.out.println("Enter the length of the three :");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();

        if(x+y>z&&x-y<z)
            System.out.println("The perimeter of the Triangle is "+(x+y+z));
        else
            System.out.println("Invalid input");
    }
}
