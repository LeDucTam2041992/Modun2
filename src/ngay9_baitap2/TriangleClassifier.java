package ngay9_baitap2;

public class TriangleClassifier {
    public static String test(double a, double b, double c) {
        if (a<=0 || b<=0 || c<=0) return "Not is triangle!";
        if (a+b<=c || b+c<=a || c+a <=b) return "Not is triangle!";
        if (a==b && b==c) return "Equilateral Triangle";
        if (a==b || b==c || c==a) return "Isosceles Triangle";
        return "Normal Triangle";
    }
}
