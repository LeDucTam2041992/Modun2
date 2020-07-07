package ngay6_baitap3;

public class Run {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2f,2f,5f,9f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
