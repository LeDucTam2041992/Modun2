package ngay7_baitap1;

public class Run {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10,6);
        shapes[2] = new Square(8);
        shapes[3] = new Square(20);
        shapes[4] = new Circle(12);
        shapes[5] = new Rectangle(10,16);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                Resizeable resizeable = (Circle) shapes[i];
                resizeable.resize(200);
            }
            if (shapes[i] instanceof Rectangle) {
                Resizeable resizeable = (Rectangle) shapes[i];
                resizeable.resize(200);
            }
            if (shapes[i] instanceof Square) {
                Resizeable resizeable = (Square) shapes[i];
                resizeable.resize(200);
                Colorable colorable = (Square) shapes[i];
                colorable.howToColor();
            }
        }

        System.out.println("-----------------------------");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
    }
}
