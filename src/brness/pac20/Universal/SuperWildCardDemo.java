package brness.pac20.Universal;

public class SuperWildCardDemo {
    public static void main(String[] args) {
        GenericStack<String> stack1=new GenericStack<>();
        GenericStack<Object> stack=new GenericStack<>();

        stack.push("Java");
        stack.push(2);
        stack1.push("Sun");
        add(stack1,stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static <T> void add(GenericStack<? extends T> stack,GenericStack<T> stack1){
        while (!stack.isEmpty())
            stack1.push(stack.pop());
    }
}
