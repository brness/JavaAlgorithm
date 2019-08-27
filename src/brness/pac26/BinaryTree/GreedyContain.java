package brness.pac26.BinaryTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class GreedyContain {
    public static void main(String[] args) {
        System.out.println("Enter the number of the objects:");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println("Enter the weights of the objects:");
        ArrayList<Integer> weight=new ArrayList<>();
        for (int i=0;i<num;i++)
            weight.add(s.nextInt());

        Collections.sort(weight);
        Collections.reverse(weight);

        ArrayList<Box> container=box(weight);

        for (int i=0;i<container.size();i++){
            System.out.println("Container "+(i+1)+" contains objects with weight "+container.get(i));
        }
    }

    public static ArrayList<Box> box(ArrayList<Integer> weights){
        ArrayList<Box> box=new ArrayList<Box>();
        for (int we:weights){
            boolean isOK=false;
            for (int i=0;i<box.size();i++){
                if (box.get(i).addweight(we)) {
                    isOK = true;
                    break;
                }
            }
            if (!isOK){
                Box n=new Box(10);
                n.addweight(we);
                box.add(n);
            }
        }
        return box;
    }

    public static class Box{
        ArrayList<Integer> list=new ArrayList<>();
        private int weight=0;
        private int maxweight=10;

        public Box(){}

        public Box(int maxweight){
            this.maxweight=maxweight;
        }

        public boolean addweight(int weight){
            int sum=0;
            for (int i=0;i<list.size();i++){
                sum=sum+list.get(i);
            }
            if (sum+weight<=maxweight) {
                list.add(weight);
                return true;
            }
            else return false;
        }

        @Override
        public String toString() {
            String o="";
            for (int i=0;i<list.size();i++){
                o=o+list.get(i).toString()+" ";
            }
            return o;
        }
    }
}
