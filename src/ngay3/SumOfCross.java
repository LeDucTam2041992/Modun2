package ngay3;

import java.util.Scanner;

public class SumOfCross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum1 = 0;
        float sum2 = 0;
        System.out.println("Enter the size of Two-dimensional arrays ");
        int x = scanner.nextInt();
        float [][] arr = new float[x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("Input the value of element (%d,%d)\n",i,j);
                arr[i][j] = scanner.nextFloat();
            }
        }

        System.out.println("The Two-dimensional arrays : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("%-10.2f",arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < x ; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][x-i-1];
        }
        System.out.printf("Sum of cross 1 = %f\n",sum1);
        System.out.printf("Sum of cross 2 = %f\n",sum2);
    }
}
