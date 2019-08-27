package brness.pac12.Abstract;

import java.util.Date;

public class House implements Cloneable,Comparable<House>{
    private int id;
    private double area;
    private Date whenBuilt;

    private House(int id,double area){
        this.id=id;
        this.area=area;
        whenBuilt=new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public int compareTo(House o){
        if(area>o.getArea())
            return 1;
        else if(area<o.getArea())
            return -1;
        else return 0;
    }
}
