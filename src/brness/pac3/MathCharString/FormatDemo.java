package brness.pac3.MathCharString;

public class FormatDemo {
    public static void main(String[] args){
        /*这里记得是printf而不是println
         */
        System.out.printf("%10s%10s%10s%10s%10s\n","Degree","Radians","Sine","Cosine","Tangent");
        int degree=30;
        System.out.printf("%10d%10.4f%10.4f%10.4f%10.4f\n",degree,Math.toRadians(degree),Math.sin(degree),Math.cos(degree),Math.tan(degree));

        degree=60;
        System.out.printf("%10d%10.4f%10.4f%10.4f%10.4f\n",degree,Math.toRadians(degree),Math.sin(degree),Math.cos(degree),Math.tan(degree));

    }
}
