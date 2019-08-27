package brness.pac25.MyList;

import brness.pac4.Loop.Str;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestStackAndQueue {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Tom");
        list=new LinkedList<>();
        list.add("Tom");
        //list=new GenericStack<>();//这里的stack不是List的子类 所以不能直接这样定义
        list.add("Tom");
//        GenericStack<String> stack=new GenericStack<>();
//
//        stack.push("Tom");
//        System.out.println("(1)"+stack);
//
//        stack.push("Susan");
//        System.out.println("(2)"+stack);
//
//        stack.push("Kim");
//        stack.push("Micheal");
//        System.out.println("(3)"+stack);
//
//        System.out.println("(4)"+stack.pop());
//        System.out.println("(5)"+stack.pop());
//        System.out.println("(6)"+stack);
//
//        GenericQueue<String> queue=new GenericQueue<>();
//        queue.enqueue("Tom");
//        System.out.println("(7)"+queue);
//
//        queue.enqueue("Susan");
//        System.out.println("(8)"+queue);
//
//        queue.enqueue("Kim");
//        queue.enqueue("Micheal");
//        System.out.println("(9)"+queue);
//
//        System.out.println("(4)"+queue.dequeue());
//        System.out.println("(5)"+queue.dequeue());
//        System.out.println("(6)"+queue);
    }
}
