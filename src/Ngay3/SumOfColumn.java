package Ngay3;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int col;
        System.out.println("Enter the row of Two-dimensional arrays ");
        int x = scanner.nextInt();
        System.out.println("Enter the column of Two-dimensional arrays ");
        int y = scanner.nextInt();
        float [][] arr = new float[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Input the value of element (%d,%d)\n",i,j);
                arr[i][j] = scanner.nextFloat();
            }
        }

        System.out.println("The Two-dimensional arrays : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("%-10.2f",arr[i][j]);
            }
            System.out.println();
        }

        do {
            System.out.println("Enter the column you want to sum all element : ");
            col = scanner.nextInt();
            if (col >= y) {
                System.out.printf("Not have a column %d in the array! Please choice again!",col);
            } else {
                float sum = 0;
                for (int i = 0; i < x; i++) {
                    sum += arr[i][col];
                }
                System.out.printf("Sum of the column %d is : %-20.2f", col, sum);
            }
        } while (col >= y);
    }
}
