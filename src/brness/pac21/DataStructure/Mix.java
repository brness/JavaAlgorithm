package brness.pac21.DataStructure;

import java.util.Arrays;
import java.util.Comparator;

public class Mix {
    public static void main(String[] args) {
        Point[] list=new Point[100];
        for(int i=0;i<100;i++){
            list[i]=new Point((int)(Math.random()*1000),(int)(Math.random()*1000));
        }
        Arrays.sort(list);
        for(int i=0;i<100;i++){
            System.out.println(list[i].toString());
        }
        Arrays.sort(list,new CompareY());
        for(int i=0;i<100;i++){
            System.out.println(list[i].toString());
        }
    }
}

class Point implements Comparable<Point>{
    private int x;
    private int y;

    public Point(){
        this.x=0;
        this.y=0;
    }

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int compareTo(Point b){
        if(this.getX()>b.getX())
            return 1;
        else if (this.getX()==b.getX()){
            if (this.getY()>b.getY())
                return 1;
            else if (this.getY()==b.getY())
                return 0;
            else return -1;
        }
        else return -1;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+")";
    }
}

class CompareY implements Comparator<Point>{
    @Override
    public int compare(Point o1, Point o2) {
        if (o1.getY()>o2.getY())
            return 1;
        else if(o1.getY()==o2.getY()){
            if(o1.getX()>o2.getX())
                return 1;
            else if (o1.getX()==o2.getX())
                return 0;
            else return -1;
        }
        else return -1;
    }
}

