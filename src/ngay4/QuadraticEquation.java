package ngay4;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        double delta = Math.pow(this.b,2) - 4*this.a*this.c;
        return delta;
    }

    public double getRoot1(){
        double r1 = (-this.b + Math.sqrt(Math.pow(this.b,2) - 4*this.a*this.c))/(2*this.a);
        return r1;
    }

    public double getRoot2(){
        double r2 = (-this.b - Math.sqrt(Math.pow(this.b,2) - 4*this.a*this.c))/(2*this.a);
        return r2;
    }
}
