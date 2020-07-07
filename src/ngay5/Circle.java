package ngay5;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    protected double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
