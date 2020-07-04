package Ngay3;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row of Two-dimensional arrays ");
        int x = scanner.nextInt();
        System.out.println("Enter the column of Two-dimensional arrays ");
        int y = scanner.nextInt();

        float[][] arr = new float[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Input the value of element (%d,%d)\n",i,j);
                arr[i][j] = scanner.nextFloat();
            }
        }

        float max = arr[0][0];
        int indexX = 0;
        int indexY = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    indexX = i;
                    indexY = j;
                }
            }
        }

        System.out.println("The Two-dimensional arrays : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("%-10.2f",arr[i][j]);
            }
            System.out.println();
        }
        System.out.printf("The max value of array : %-10.2f\n",max);
        System.out.printf("The position of max value : arr(%d,%d)",indexX,indexY);

    }
}
