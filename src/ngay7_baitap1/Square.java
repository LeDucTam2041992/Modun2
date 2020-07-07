package ngay7_baitap1;

public class Square extends Shape implements Resizeable, Colorable {
    protected double side = 0;

    public Square() {
    }

    public Square(double side){
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + side
                +" area= " + getArea();

    }
    @Override
    public void resize(double percent) {
        this.side*=percent/100;
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides..");
    }
}
