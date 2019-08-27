package brness.pac26.BinaryTree;

import brness.pac21.DataStructure.Circle;
import brness.pac21.DataStructure.GeometricObjectComparator;
import brness.pac21.DataStructure.GeomotricObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Exercise14 {
    public static class BST<E>{
        private TreeNode<E> root;
        private int size;
        private Comparator<? super E> comparator;//带比较器的要在类里面带一个比较器的构造方法，比较时用compare。

        private class TreeNode<E>{
            E element;
            TreeNode<E> left;
            TreeNode<E> right;

            public TreeNode(E element){
                this.element=element;
            }
        }

        public BST(){}

        public BST(Comparator<? super E> comparator){
            this.comparator=comparator;
        }

        public BST(E[] objects){
            for (int i=0;i<objects.length;i++)
                insert(objects[i]);
        }

        public boolean insert(E e){
            if (size==0)
                root=creatNewNode(e);
            else {
                TreeNode<E> current=root;
                TreeNode<E> parent=null;
                while (current!=null) {
                    if (comparator.compare(e, current.element) < 0) {
                        parent = current;
                        current = current.left;
                    }
                    else if (comparator.compare(e, current.element) > 0) {
                        parent = current;
                        current = current.right;
                    }
                    else return false;
                }
                //这里要实现的是怎么插入
                TreeNode<E> newNode=new TreeNode<>(e);
                if (comparator.compare(e,parent.element)<0)
                    parent.left=newNode;
                else parent.right=newNode;
            }
            size++;
            return true;
        }

        protected TreeNode<E> creatNewNode(E e){
            return new TreeNode<>(e);
        }

        public void inorder(){
            inorder(root);
        }

        public void inorder(TreeNode<E> root){
            if (root!=null){
                inorder(root.left);
                System.out.print(root.element+" ");
                inorder(root.right);
            }
        }

        public Iterator<E> preorerIterator(){
            return new PreOrderIterator();
        }

        public class PreOrderIterator implements Iterator<E>{
            private ArrayList<E> list=new ArrayList<>();
            private int current=0;

            public PreOrderIterator(){
                PreOrder();
            }

            public void PreOrder(){
                PreOrder(root);
            }

            public void PreOrder(TreeNode<E> root){
                if (root!=null){
                    list.add(root.element);
                    PreOrder(root.left);
                    PreOrder(root.right);
                }
            }

            public E next(){
                return list.get(current++);
            }

            public boolean hasNext(){
                if (current<list.size())
                    return true;
                else return false;
            }
        }
    }

    public static void main(String[] args) {
        BST<GeomotricObject> Circles=new BST<GeomotricObject>(new GeometricObjectComparator());
        Circles.insert(new Circle(3));
        Circles.insert(new Circle(1));
        Circles.insert(new Circle(5));


        Circles.inorder();//这个是按照里面的中序遍历出来的结果


        //这里是我在迭代器里面定义的前序遍历出来的结果
        Iterator<GeomotricObject> iterator=Circles.preorerIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

    }
}
