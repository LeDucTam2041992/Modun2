package Ngay3;

import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers element of array : ");
        int numb = scanner.nextInt();
        int [] arr = new int[numb];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input value of element " + i);
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        System.out.println("The max element of array is " +max);
    }
}
