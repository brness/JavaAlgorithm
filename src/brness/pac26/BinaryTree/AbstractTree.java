package brness.pac26.BinaryTree;

public abstract class AbstractTree<E> implements Tree<E>{
    @Override
    public void inorder(E e) {

    }

    @Override
    public void postorder(E e) {

    }

    @Override
    public void preorder(E e) {

    }

    public boolean isEmpty(){
        return getSize()==0;
    }

}
