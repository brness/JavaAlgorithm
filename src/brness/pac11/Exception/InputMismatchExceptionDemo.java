package brness.pac11.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean continueInput=true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number=s.nextInt();

                System.out.print("The number entered is "+number);
                continueInput=false;
            }catch (InputMismatchException ex){
                System.out.print("Try again:");
                s.nextLine();
            }
        }while (continueInput);
    }
}
