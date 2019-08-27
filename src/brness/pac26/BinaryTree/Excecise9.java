package brness.pac26.BinaryTree;

public class Excecise9 {
    public static void main(String[] args) {
        Integer[] numbers={2,4,3,1,8,5,6,7};
        BST<Integer> intTree=new BST<>(numbers);
        BST<Integer> clone=new BST<>();
        clone.clone(intTree);

        for (int s:clone){
            System.out.print(s+" ");
        }

        System.out.print("the clone is equal to the original?"+intTree.equals(clone));
    }
}
