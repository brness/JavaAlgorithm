package brness.pac26.BinaryTree;

import java.util.ListIterator;

public class Exercise8 {
    public static void main(String[] args) {
        Integer[] numbers={2,4,3,1,8,5,6,7};
        BST<Integer> intTree=new BST<>(numbers);
        for (int t:intTree){
            System.out.print(t+" ");
        }

        ListIterator<Integer> iterator=intTree.iterator();
        System.out.print(iterator.next()+" ");
        System.out.print(iterator.next()+" ");
        System.out.print(iterator.next()+" ");
        System.out.print(iterator.next()+" ");

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous());
        }
    }
}
