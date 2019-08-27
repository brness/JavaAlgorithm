package brness.pac26.BinaryTree;

public class Exercise2 {
    public static void main(String[] args) {
        Integer[] numbers={5,1,6};
        BST<Integer> intTree=new BST<>(numbers);
        System.out.print("Is the tree a full BST?"+intTree.isFullBST());
    }
}
