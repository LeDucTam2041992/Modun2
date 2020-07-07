package ngay4;

import java.util.Scanner;

public class QuadraticEquationRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quadratic Equation 2 : ax2 + bx + c = 0 : ");
        System.out.println("Enter a = ");
        double a = scanner.nextDouble();
        System.out.println("Enter b = ");
        double b = scanner.nextDouble();
        System.out.println("Enter c = ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("The Quadratic has 2 roots : ");
            System.out.printf("root 1 = %f\nroot 2 = %f",quadraticEquation.getRoot1(),
                    quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.printf("The Quadratic has 1 root : %f",quadraticEquation.getRoot1());
        }
        else {
            System.out.println("The Quadratic has no real root");
        }
    }
}
