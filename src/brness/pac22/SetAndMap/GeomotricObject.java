package brness.pac22.SetAndMap;

import java.util.Date;

public abstract class GeomotricObject {
    private String color="white";
    private boolean filled;
    private Date dateCreated;

    protected GeomotricObject(){
        dateCreated=new Date();
    }

    protected GeomotricObject(String color,boolean filled){
        this.filled=filled;
        this.color=color;
        dateCreated=new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract double getArea();

    public abstract  double getPerimeter();
}

