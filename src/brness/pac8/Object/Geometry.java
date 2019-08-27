package brness.pac8.Object;

public class Geometry {
    public static void main(String[] args) {
        RegularPolygon nu=new RegularPolygon();
        RegularPolygon nu1=new RegularPolygon(6,4);
        RegularPolygon nu2=new RegularPolygon(10,4,5.6,7.8);

        System.out.println("The Perimeter of the default Polygon is "+nu.getPerimeter());
        System.out.println("The area of the default Polygon is "+nu.getArea());

        System.out.println("The Perimeter of the first Polygon is "+nu1.getPerimeter());
        System.out.println("The area of the first Polygon is "+nu1.getArea());

        System.out.println("The Perimeter of the second Polygon is "+nu2.getPerimeter());
        System.out.println("The area of the second Polygon is "+nu2.getArea());
    }
}

class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        n=3;
        side=1;
        x=0;
        y=0;
    }

    public RegularPolygon(int n,double side){
        this.n=n;
        this.side=side;
        this.x=0;
        this.y=0;
    }

    public RegularPolygon(int n,double side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }

    public void setN(int n){
        this.n=n;
    }

    public void setSide(double side){
        this.side=side;
    }

    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }

    public int getN(){
        return n;
    }

    public double getSide(){
        return side;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getPerimeter(){
        return n*side;
    }

    public double getArea(){
        return n*side*side/4/Math.tan(Math.PI/n);
    }
}
