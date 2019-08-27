package brness.pac27.AVLTree;

import brness.pac26.BinaryTree.BST;

public class TestAVL {
    public static void main(String[] args) {
        AVLTree<Integer> tree=new AVLTree<>(new Integer[]{25,20,2});
        System.out.print("After insert the num:");
        printTree(tree);

        tree.insert(34);
        tree.insert(50);
        System.out.print("\nAfter insert the new num:");
        printTree(tree);

        tree.insert(30);
        System.out.print("\nAfter insert 30");
        printTree(tree);

        tree.insert(10);
        System.out.print("\nAfter insert 10");
        printTree(tree);

        tree.delete(34);
        tree.delete(30);
        tree.delete(50);
        System.out.print("\nAfter removing 34 50 30:");
        printTree(tree);

        tree.delete(5);
        System.out.print("\nAfter removing 5:");
        printTree(tree);

        System.out.print("\nthe element in the tree: ");
        for (int e:tree){
            System.out.print(e+" ");
        }
    }

    public static void printTree(BST tree){
        System.out.print("\nInorder :");
        tree.inorder();
        System.out.print("\nPreorder :");
        tree.preorder();
        System.out.print("\nPostorder:");
        tree.postorder();
        System.out.print("\nThe number of the nodes is "+tree.getSize());
        System.out.println();
    }
}
