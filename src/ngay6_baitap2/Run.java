package ngay6_baitap2;

public class Run {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.5f,9.9f);
        System.out.println(point2D);
        Point3D point3D = new Point3D(2.2f,3.3f,4.4f);
        System.out.println(point3D);
        point3D.setXYZ(5.5f,6.6f,7.7f);
        System.out.println(point3D);
        float[] arr = point2D.getXY();
        System.out.println(arr[1]);

    }
}
