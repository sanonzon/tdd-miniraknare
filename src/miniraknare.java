/**
 * Created by suddan on 2016-04-04.
 */
public class miniraknare {

    private double add(double x, double y) {
        return x+y;
    }
    private double sub(double x, double y) {
        return x-y;
    }
    private double mult(double x, double y) {
        return x*y;
    }
    private double divide(double x, double y) {
        return x/y;
    }
    
    public double sqrt(double x) {
        return Math.sqrt(x);
    }
    
    public double pi(double x, double y) {
        return Math.PI;
    }
    public double reset() {
        return 0;
    }


    public static void main(String[] args) {
        miniraknare rakna = new miniraknare();

        double x = 3;
        double y = 4;

        System.out.println(rakna.add(x,y));
        System.out.println(rakna.sub(x,y));
        System.out.println(rakna.mult(x,y));
        System.out.println(rakna.divide(x,y));
        System.out.println(rakna.sqrt(x));


    }
}
