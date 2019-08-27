package brness.pac26.BinaryTree;

public class Exercise3 {
    public static void main(String[] args) {
        Integer[] numbers={2,4,3,1,8,5,6,7};
        BST<Integer> intTree=new BST<>(numbers);
        intTree.inorderwithoutrecursive();
    }
}
