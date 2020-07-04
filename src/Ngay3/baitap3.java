package Ngay3;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of first array  : ");
        int numberElementOfArr1 = scanner.nextInt();
        int [] arr1 = new int[numberElementOfArr1];
        System.out.println("The first array : ");
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i] = (int) Math.round(Math.random()*50);
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();

        System.out.println("Enter the numbers of second array  : ");
        int numberElementOfArr2 = scanner.nextInt();
        int [] arr2 = new int[numberElementOfArr2];
        System.out.println("The second array : ");
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i] = (int) Math.round(Math.random()*50);
            System.out.print(arr2[i]+"\t");
        }
        System.out.println();

        int [] arr3 = new int[numberElementOfArr1+numberElementOfArr2];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length ; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println("The third array from first array and second array : ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}

