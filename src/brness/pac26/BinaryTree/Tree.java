package brness.pac26.BinaryTree;

import java.util.Iterator;

public interface Tree<E> extends Iterable<E>{
    public boolean search(E e);

    public boolean insert(E e);

    public boolean delete(E e);

    public void inorder(E e);

    public void postorder(E e);

    public void preorder(E e);

    public int getSize();

    public boolean isEmpty();
}
