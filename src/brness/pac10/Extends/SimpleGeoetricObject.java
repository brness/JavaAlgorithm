package brness.pac10.Extends;

import java.util.Date;

public class SimpleGeoetricObject {
    private String color="white";
    private boolean filled;
    private Date datecreated;

    public SimpleGeoetricObject(){
        datecreated=new Date();
    }

    public SimpleGeoetricObject(String color,boolean filled){
        datecreated=new Date();
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public String toString(){
        return "created on: "+datecreated+"\ncolor "+color+" and filled: "+filled;
    }
}
