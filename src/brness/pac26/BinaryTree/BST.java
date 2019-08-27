package brness.pac26.BinaryTree;

import brness.pac25.MyList.GenericQueue;
import brness.pac25.MyList.GenericStack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size=0;

    public BST(){}

    public BST(E[] objects){
        for (int i=0;i<objects.length;i++){
            insert(objects[i]);
        }
    }

    public boolean search(E e){
        TreeNode<E> current=root;

        while(current!=null){
            if (e.compareTo(current.element)<0){
                current=current.left;
            }
            else if (e.compareTo(current.element)>0){
                current=current.right;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean insert(E e) {
        if (root==null)
            root=creatNewNode(e);
        else {
            TreeNode<E> parent=null;
            TreeNode<E> current=root;
            while (current!=null){
                if (e.compareTo(current.element)<0){
                    parent=current;
                    current=current.left;
                }
                else if (e.compareTo(current.element)>0){
                    parent=current;
                    current=current.right;
                }
                else return false;
            }
            //将新节点插入到父节点下面
            if (e.compareTo(parent.element)<0){
                parent.left=creatNewNode(e);
            }
            else parent.right=creatNewNode(e);
        }
        size++;
        return true;
    }

    protected TreeNode<E> creatNewNode(E e){
        return new TreeNode<>(e);
    }

    public void breadthFirstTraversal(){
        GenericQueue<TreeNode<E>> queue=new GenericQueue<>();
        TreeNode<E> current=null;
        queue.enqueue(root);
        while (queue.getSize()!=0){
            current=queue.dequeue();
            System.out.print(current.element+" ");
            if (current.left!=null){
                queue.enqueue(current.left);
            }
            if (current.right!=null)
                queue.enqueue(current.right);
        }
    }

    public int height(){
        GenericQueue<TreeNode<E>> queue=new GenericQueue<>();
        TreeNode<E> current=null;
        queue.enqueue(root);
        int height=0;
        while (queue.getSize()!=0){
            current=queue.dequeue();
            if (current.left!=null){
                queue.enqueue(current.left);
            }
            if (current.right!=null)
                queue.enqueue(current.right);
            if (current.right!=null||current.left!=null)
                height++;
        }
        return height;
    }

    public boolean isFullBST(){
        if (size!=(Math.pow(2,height()+1)-1))
            return false;
        return true;
    }

    //用非递归的方式实现
    protected void inorderwithoutrecursive(){
        GenericStack<TreeNode<E>> stack=new GenericStack<>();
        TreeNode<E> current=root;
        stack.push(current);
        while (!stack.isEmpty()){
            while (current.left!=null){
                stack.push(current.left);
                current=current.left;
            }
            current=stack.pop();
            System.out.print(current.element+" ");
            if (current.right!=null){
                stack.push(current.right);
                current=current.right;
            }
        }
    }


    //用递归实现的中序遍历
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root){
        if (root==null)
            return;
        inorder(root.left);
        System.out.print(root.element+" ");
        inorder(root.right);
    }

    //用非递归的方式，用stack
    protected void preorderwithourecursive(){
        GenericStack<TreeNode<E>> stack=new GenericStack<>();
        TreeNode<E> current=null;
        stack.push(root);
        while (!stack.isEmpty()){
            current=stack.pop();
            System.out.print(current.element+" ");
            //这里使用栈来存储，所以是先把右边的子树存进去，到时候pop的时候就是左子树先出来
            if (current.right!=null)
                stack.push(current.right);
            if (current.left!=null)
                stack.push(current.left);
        }
    }

    //用递归的方式实现前序遍历
    public void preorder() {
        preorder(root);
    }

    protected void preorder(TreeNode<E> root){
        if (root==null)
            return;
        System.out.print(root.element+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(){
        postorder(root);
    }

    protected void postorder(TreeNode<E> root){
        if (root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element+" ");
    }


    public int getNumberofLeaves(){
        GenericQueue<TreeNode<E>> queue=new GenericQueue<>();
        TreeNode<E> current=null;
        queue.enqueue(root);
        int leaves=0;
        while (queue.getSize()!=0){
            current=queue.dequeue();
            if (current.left!=null)
                queue.enqueue(current.left);
            if (current.right!=null)
                queue.enqueue(current.right);
            if (current.left==null&&current.right==null)
                leaves++;
        }
        return leaves;
    }

    public int getNumberofNonLeaves(){
        return size-getNumberofLeaves();
    }

    public static class TreeNode<E extends Comparable<E>> {
        public E element;
        public TreeNode<E> left;
        public TreeNode<E> right;

        public TreeNode(E e) {
            element = e;
        }
    }

    public boolean equals(BST<E> bst){
        ArrayList<E> old=new ArrayList<>();
        ArrayList<E> original=new ArrayList<>();
        if (bst.size!=size)
            return false;
        while (iterator().hasNext()&&bst.iterator().hasNext()){
            old.add(iterator().next());
            original.add(bst.iterator().next());
        }

        Object[] array1 = new Object[this.size];
        Object[] array2 = new Object[bst.size];
        old.toArray(array1);
        original.toArray(array2);
        return java.util.Arrays.equals(array1, array2);
    }

    public void clone(BST<E> old){
        ListIterator<E> iterator=old.iterator();
        while (iterator.hasNext()){
            insert(iterator.next());
        }
    }

    public int getSize() {
        return size;
    }

    public TreeNode<E> getRoot(){
        return root;
    }

    public ArrayList<TreeNode<E>> path(E e){
        ArrayList<TreeNode<E>> list=new ArrayList<>();
        TreeNode<E> current=root;

        while (current!=null){
            if (e.compareTo(current.element)<0){
                list.add(current);
                current=current.left;
            }
            else if (e.compareTo(current.element)>0){
                list.add(current);
                current=current.right;
            }
            else {
                list.add(current);
                break;
            }
        }
        return list;
    }

    public boolean delete(E e){
        TreeNode<E> parent=null;
        TreeNode<E> current=root;

        while (current!=null){
            if (e.compareTo(current.element)<0){
                parent=current;
                current=current.left;
            }
            if (e.compareTo(current.element)>0){
                parent=current;
                current=current.right;
            }
            else break;
        }

        if (current==null)
            return false;
        if (current.left==null){
            //对于current没有左孩子的情况
            if (parent==null){
                root=current.right;
            }
            else {
                if (e.compareTo(parent.element)<0)
                    parent.left=current.right;
                else
                    parent.right=current.right;
            }
        }else {
            //对于current节点有左孩子的情况
            //找到其左子树的最大的元素，也就是最右的元素
            TreeNode<E> parentofRightMost=current;
            TreeNode<E> rightMost=current.left;

            //找到其左子树中最大的元素
            while (rightMost.right!=null){
                parentofRightMost=rightMost;
                rightMost=rightMost.right;
            }

            current.element=rightMost.element;

            //消除最右的元素
            if (parentofRightMost.right==rightMost)
                parentofRightMost.right=rightMost.left;
            else parentofRightMost.left=rightMost.left;
        }
        size--;
        return true;
    }

    @Override
    public ListIterator<E> iterator() {
        return new InorderIterator();
    }

    private class InorderIterator implements ListIterator<E>{
        private ArrayList<E> list=new ArrayList<>();
        private int current=0;//指向list的位置指针

        public InorderIterator(){
            inorder();
        }

        private void inorder(){
            inorder(root);
        }

        private void inorder(TreeNode<E> root){
            if (root==null)
                return;
            inorder(root.left);
            list.add(root.element);
            inorder(root.right);
        }

        public boolean hasNext(){
            if (current<list.size())
                return true;
            else return false;
        }

        @Override
        public E next(){
            return list.get(current++);
        }

        @Override
        public int nextIndex() {
            return current+1;
        }

        @Override
        public E previous() {
            return list.get(--current);
        }

        @Override
        public int previousIndex() {
            return current-1;
        }

        @Override
        public void add(E e) {
            throw new UnsupportedOperationException("No need to add an element to the BST");
        }


        @Override
        public boolean hasPrevious() {
            if (current>0)
                return true;
            else return false;
        }

        public void remove(){
            delete(list.get(current));
            list.clear();
            inorder();
        }

        @Override
        public void set(E e) {
            throw new UnsupportedOperationException("no need to set an element to the BST");
        }
    }

    public void clear(){
        root=null;
        size=0;
    }
}
