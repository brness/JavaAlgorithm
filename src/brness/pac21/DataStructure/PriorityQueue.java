package brness.pac21.DataStructure;

import java.util.Collections;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> queue=new java.util.PriorityQueue<>();
        queue.add(1);
        queue.add(4);
        queue.add(7);
        queue.add(3);
        queue.add(2);

        while (queue.size()>0){
            System.out.print(queue.remove());
        }

        java.util.PriorityQueue<Integer> queue1=new java.util.PriorityQueue<>(4, Collections.reverseOrder());
        queue1.add(4);
        queue1.add(7);
        queue1.add(3);
        queue1.add(2);
        while (queue1.size()>0){
            System.out.println(queue1.remove());
        }

    }
}
