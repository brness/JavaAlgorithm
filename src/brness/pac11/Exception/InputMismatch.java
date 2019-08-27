package brness.pac11.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        System.out.println("Enter two integer");
        Scanner s=new Scanner(System.in);
        boolean p=true;//用p来跳出循环
        int result=0;
        do {
            try {
                int x = s.nextInt();
                int y = s.nextInt();
                result=x+y;
                p=false;
            } catch (InputMismatchException e) {
                System.out.println("Input type misMatched,please input again");
                s.nextLine();//s.nextLine用于跳出这一行，重新输入
            }
        }while (p);
        System.out.println("The sum of the two number is "+result);
    }

}
