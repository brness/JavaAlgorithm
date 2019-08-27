package brness.pac21.DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class Houzui {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Usage: java Houzi \"asdf\"");
            System.exit(1);
        }
        Scanner s=new Scanner(args[0]);
        Stack<Integer> stack=new Stack<>();
        while (s.hasNext()){
            String x=s.next();
            if (Character.isDigit(x.charAt(0))){
                stack.push(Integer.parseInt(x));
            }
            else if(x.charAt(0)=='+'||x.charAt(0)=='-'||x.charAt(0)=='*'||x.charAt(0)=='/'){
                int op2=stack.pop();
                int op1=stack.pop();
                if (x.charAt(0)=='+')
                    stack.push(op1+op2);
                else if(x.charAt(0)=='-')
                    stack.push(op1-op2);
                else if(x.charAt(0)=='*')
                    stack.push(op1*op2);
                else stack.push(op1/op2);
            }
        }
        System.out.println("The equation is "+stack.get(0));
    }
}
