package ngay6_baitap1;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(10,"blue");
        Cylinder cylinder = new Cylinder(20,"red",10);
        System.out.println(circle);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
    }
}
