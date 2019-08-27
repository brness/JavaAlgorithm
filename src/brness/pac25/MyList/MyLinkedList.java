package brness.pac25.MyList;

import java.util.Iterator;

public class MyLinkedList<E> extends MyAbstractList<E> {
    private class Node<E> {
        E element;
        Node<E> next;

        public Node(E e) {
            element = e;
        }
    }

    private Node<E> head;
    private Node<E> tail;

    public MyLinkedList() {
    }


    public MyLinkedList(E[] elements) {
        super(elements);
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
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null)
            head = tail = newNode;
        else tail.next = newNode;
        tail = tail.next;

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
            current.next = new Node<E>(e);
            (current.next).next = temp;
        }
        size++;
    }

    public E removeFirst() {
        if (size == 0) return null;
        else {
            Node<E> temp = head;
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

    public boolean contains(E e) {
        Node<E> current = head;
        for (int i = 1; i < size; i++) {
            if (current.element.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }

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
    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator<E>{
        private Node<E> current=head;

        public boolean hasNext(){
            return current!=null;
        }

        public E next(){
            E e=current.element;
            current=current.next;
            return e;
        }

        public void remove(){
            MyLinkedList.this.remove(current.element);
        }
    }
}

