package brness.pac26.BinaryTree;

public class TestBSTDelete {
    public static void printTree(BST tree){
        System.out.print("Inorder:");
        tree.inorder();
        System.out.print("\nPreorder");
        tree.preorder();
        System.out.print("\nPostorder");
        tree.postorder();
        System.out.print("\nThe number of the nodes is "+tree.getSize());
    }
    public static void main(String[] args) {
        BST<String> tree=new BST<>();

        tree.insert("George");
        tree.insert("Micheal");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        printTree(tree);

        System.out.print("\nAfter delete George");
        tree.delete("George");
        printTree(tree);

        System.out.print("\nAfter delete Adam");
        tree.delete("Adam");
        printTree(tree);
    }
}
