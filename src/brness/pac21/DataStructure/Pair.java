package brness.pac21.DataStructure;

import java.io.File;
import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Pair {
    public static void main(String[] args) throws IOException{
        if (args.length!=1){
            System.out.println("Usage:java Pair name.txt");
            System.exit(1);
        }
        File file=new File(args[0]);
        Scanner input=new Scanner(file);
        int p=0;
        String all="";
        while (input.hasNext()){
            String line=input.nextLine();
            all+=line;
        }
        if(!check(all)){
            p=1;
        }
        if(p==1){
            System.out.println("The format is wrong");
        }
        else System.out.println("The format is correct");
    }

    public static boolean check(String s){
        Stack<Character> stack=new Stack<>();
            try {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                        stack.push(s.charAt(i));
                    else if (s.charAt(i) == ')') {
                        if (stack.pop() != '(')
                            return false;
                    } else if (s.charAt(i) == '}') {
                        if (stack.pop() != '{')
                            return false;
                    } else if (s.charAt(i) == ']') {
                        if (stack.pop() != '[')
                             return false;
                    }
                }
            }catch (Exception e){
                System.out.println("Empty stack");
            }
            if (stack.isEmpty())
                return true;
            else return false;
    }
}
