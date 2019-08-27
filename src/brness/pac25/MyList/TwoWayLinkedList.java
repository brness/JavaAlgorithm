package brness.pac25.MyList;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

public class TwoWayLinkedList<E> extends AbstractSequentialList<E>{
    public static void main(String[] args) {
        TwoWayLinkedList<Integer> list = new TwoWayLinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        java.util.ListIterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
//        iterator.next();
//        iterator.next();
//        iterator.next();

        //System.out.print(iterator.next() + " ");

//        System.out.println();
//        while (iterator.hasPrevious())
//            System.out.print(iterator.previous() + " ");
    }

    private class Node<E>{
        E element;
        Node<E> next;
        Node<E> previous;

        public Node(E e){
            element=e;
        }
    }

    private int size=0;
    private Node<E> head;
    private Node<E> tail;

    public int size(){
        return size;
    }

    public TwoWayLinkedList() {
    }


    public TwoWayLinkedList(E[] elements) {
        for (int i=0;i<elements.length;i++){
            add(elements[i]);
        }
    }

    public E getFirst() {
        return head.element;
    }

    public E getLast() {
        return tail.element;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null)
            tail = head;

        if (head!=tail) head.next.previous=head;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null)
            head = tail = newNode;
        else{
            tail.next = newNode;
            newNode.previous=tail;
            tail = tail.next;
        }

        size++;
    }

    public void add(int index, E e) {
        if (index == 0) addFirst(e);
        else if (index >= size) addLast(e);
        else {//Insert in the middle
            Node<E> current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node<E> temp = current.next;
            Node<E> newNode=new Node<E>(e);
            current.next = newNode;
            newNode.previous=current;
            newNode.next=temp;
            temp.previous=newNode;
        }
        size++;
    }

    public E removeFirst() {
        if (size == 0) return null;
        else {
            Node<E> temp = head;
            head.next.previous=null;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return temp.element;
        }
    }

    public E removeLast() {
        if (size == 0) return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 1; i < size - 1; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) return null;
        else if (index == 0) return removeFirst();
        else if (index == size - 1) return removeLast();
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = current.next.next;
            temp.previous=current;
            size--;
            return temp.element;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            result.append(current.element);
            result.append(", ");
            current = current.next;
        }
        return result.toString() + "]";
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }


//    public boolean contains(E e){
//        Node<E> current = head;
//        for (int i = 1; i < size; i++) {
//            if (current.element.equals(e))
//                return true;
//            current = current.next;
//        }
//        return false;
//    }

    public E get(int index) {
        checkIndex(index);
        Node<E> current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index" + index + " is out of bound");
        }
    }

    public int indexof(E e) {
        int k = 0;
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) {
                return k;
            }
            k++;
            current = current.next;
        }
        return -1;
    }

    public int lastIndexof(E e){
        Node<E> current=head;
        for (int i=size-1;i>=0;i--){
            for (int j=0;j<i;j++)
                current=current.next;
            if (current.element.equals(e))
                return i;
        }
        return -1;
    }

    public E set(int index,E e){
        checkIndex(index);
        Node<E> current=head;
        if (index==0){
            removeFirst();
            addFirst(e);
            return current.element;
        }
        else {
            for (int i=1;i<index;i++){
                current=current.next;
            }
            Node<E> newNode=new Node<>(e);
            Node<E> oldNode=current.next;
            current.next=newNode;
            newNode.next=oldNode.next;
            return oldNode.element;
        }
    }

    @Override
    public java.util.ListIterator<E> iterator() {
        return new LinkedListIterator<E>();
    }

    private class LinkedListIterator<E> implements java.util.ListIterator<E> {
        private Node<E> current = (Node<E>)head; // Current index
        int index = 0;

        public LinkedListIterator() {
        }

        public LinkedListIterator(int index) {
            if (index < 0 || index > size)
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
                        + size);
            for (int nextIndex = 0; nextIndex < index; nextIndex++)
                current = current.next;
        }

        public boolean hasNext() {
            return (current != null);
        }

        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        public void remove() {
            current.previous.next=current.next;
            current.next.previous=current.previous;
            size--;
        }

        public void add(E e) {
            Node<E> newNode=new Node<>(e);
            current.next.previous=newNode;
            newNode.next=current.next;
            newNode.previous=current;
            current.next=newNode;
            size++;
        }

        public boolean hasPrevious() {
            return current != head;
        }

        public int nextIndex() {
            return 0;
        }

        public E previous() {
            E e = current.element;
            current = current.previous;
            return e;
        }

        public int previousIndex() {
            System.out.println("Implementation left as an exercise");
            return 0;
        }

        @Override
        public void set(E e) {
            current.element = e; // TODO Auto-generated method stub
        }
    }

    public ListIterator<E> listIterator(int index) {
        return new LinkedListIterator<E>(index);
    }
}

