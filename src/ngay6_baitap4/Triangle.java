package ngay6_baitap4;

import ngay6_thuchanh.Shape;

public class Triangle extends Shape {
    private double side1,side2,side3 = 0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean isTriangle(){
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) return false;
        return true;
    }

    public double getArea(){
        if (!isTriangle()) return -1;
        double p = (side1 + side2 + side3)/2;
        double s = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return s;
    }

    public double getPerimeter(){
        if (!isTriangle()) return -1;
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        if (!isTriangle())
            return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color=" + color +
                " The triangle is non-existent";

        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color=" + color +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
