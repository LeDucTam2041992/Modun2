package ngay6_baitap4;

public class Run {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,1,1);
        System.out.println(triangle.getPerimeter());
        triangle.setSide1(2);
        triangle.setColor("Yellow");
        System.out.println(triangle);
        System.out.println(triangle.getArea());

    }
}
