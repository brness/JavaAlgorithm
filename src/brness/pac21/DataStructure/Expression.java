package brness.pac21.DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class Expression {
    public static void main(String[] args) {
        System.out.println("Enter an expression:");
        Scanner s=new Scanner(System.in);
        String expression=s.nextLine();

        expression=insertBlank(expression);
        try {
            double result=evalueateExpress(expression);
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Wrong expression");
        }

    }

    public static String insertBlank(String s){
        String result="";
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='+'||s.charAt(i)=='-'||
                    s.charAt(i)=='*'||s.charAt(i)=='/'||
                    s.charAt(i)=='%'||s.charAt(i)=='^'||
                    s.charAt(i)==')'||s.charAt(i)=='(')
                result+=" "+s.charAt(i)+" ";
            else result+=s.charAt(i);
        }
        return result;
    }

    public static double evalueateExpress(String s){
        String[] tokens=s.split("");
        Stack<Double> num=new Stack<>();
        Stack<Character> operation=new Stack<>();
        for (String token:tokens){
            if (token.charAt(0)==' '||token.length()==0)
                continue;
            else if (token.charAt(0)=='+'||token.charAt(0)=='-'){
                if(!operation.isEmpty()&&(operation.peek()=='+'||operation.peek()=='-'||
                        operation.peek()=='*'||operation.peek()=='%'||
                        operation.peek()=='/'||operation.peek()=='^')){
                    operate(num,operation);
                }
                operation.push(token.charAt(0));
            }
            else if (token.charAt(0)=='*'||token.charAt(0)=='/'||token.charAt(0)=='%'){
                if(!operation.isEmpty()&&(operation.peek()=='*'||operation.peek()=='%'||
                        operation.peek()=='/'||operation.peek()=='^'||operation.peek()=='%')){
                    operate(num,operation);
                }
                operation.push(token.charAt(0));
            }
            else if (token.charAt(0)=='^'){
                if(!operation.isEmpty()&&( operation.peek()=='^')){
                    operate(num,operation);
                }
                operation.push(token.charAt(0));
            }
            else if (token.charAt(0)=='(')
                operation.push('(');
            else if (token.charAt(0)==')'){
                while (operation.peek()!='('){
                    operate(num,operation);
                }
                operation.pop();
            }
            else
                num.push(Double.parseDouble(token));
        }
        if (!operation.isEmpty())
            operate(num,operation);
        return num.pop();
    }

    public static void operate(Stack<Double> num,Stack<Character> operation){
        char operator=operation.pop();
        double o1=num.pop();
        double o2=num.pop();

        if(operator=='+'){
            num.push(o2+o1);
        }
        else if (operator=='-')
            num.push(o2-o1);
        else if (operator=='*')
            num.push(o2*o1);
        else if(operator=='/')
            num.push(o2/o1);
        else if (operator=='^')
            num.push(Math.pow(o2,o1));
        else if (operator=='%')
            num.push(o2%o1);
    }
}
