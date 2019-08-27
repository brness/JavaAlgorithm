package brness.pac12.Abstract;

public class Complex extends Number implements Comparable<Complex>,Cloneable{
    private double a;
    private double b;

    public Complex(){
        a=0;
        b=0;
    }

    public Complex(double a,double b){
        this.a=a;
        this.b=b;
    }

    public Complex(double a){
        this.a=a;
        this.b=0;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Complex add(Complex o){
        double x=this.a+o.getA();
        double y=this.b+o.getB();
        return new Complex(x,y);
    }

    public Complex substract(Complex o){
        double x=a-o.getA();
        double y=b-o.getB();
        return new Complex(x,y);
    }

    public Complex mutiply(Complex o){
        double x=a*o.getA()-b*o.getB();
        double y=b*o.getA()+a*o.getB();
        return new Complex(x,y);
    }

    public Complex divide(Complex o){
        double x=(a*o.getA()+b*o.getB())/(o.getB()*o.getB()+o.getA()*o.getA());
        double y=(b*o.getA()-a*o.getB())/(o.getB()*o.getB()+o.getA()*o.getA());
        return new Complex(x,y);
    }

    public double abs(){
        return Math.sqrt(a*a+b*b);
    }

    public String toString(){
        if(b==0)
            return a+"";
        else return a+""+"+"+b+"i";
    }

    public int compareTo(Complex o){
        if(this.a>o.getA())
            return 1;
        else if(this.a==o.getA()){
            if (b>o.getB())
                return 1;
            else if (b==o.getB())
                return 0;
            else return -1;
        }
        else return -1;
    }

    public int intValue(){
        return (int)doubleValue();
    }

    public float floatValue(){
        return (float)floatValue();
    }

    public double doubleValue(){
        return (double)doubleValue();
    }

    public long longValue(){
        return (long)longValue();
    }
}
