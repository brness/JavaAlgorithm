package brness.pac26.BinaryTree;

import java.util.ArrayList;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree=new BST<>();

        tree.insert("George");
        tree.insert("Micheal");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.print("Inorder: ");
        tree.inorder();

        System.out.print("\nPostorder:");
        tree.postorder();

        System.out.print("\nPreorder");
        tree.preorder();

        System.out.println("Is Peter in the tree? "+tree.search("Peter"));

        System.out.println("The path from root to Peter is");
        ArrayList<BST.TreeNode<String>> path=tree.path("Peter");
        for (int i=0;i<path.size();i++){
            System.out.print(path.get(i).element+"\t");
        }

        Integer[] numbers={2,4,3,1,8,5,6,7};
        BST<Integer> intTree=new BST<>(numbers);
        System.out.print("\nInorder:");
        intTree.inorder();
    }
}
