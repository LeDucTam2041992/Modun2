package ngay3;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of array : ");
        int numb = scanner.nextInt();
        int[] arr = new int[numb];
        int k = (int) Math.round(numb/1.5);
        for (int i = 0; i < k ; i++) {
            arr[i] = (int) Math.round(Math.random() * 20);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("Enter the number X you want insert : ");
        int x = scanner.nextInt();
        System.out.println("Enter the index of array you want to insert : ");
        int indexInsert = scanner.nextInt();
        for (int i = arr.length-1; i > indexInsert ; i--) {
            arr[i] = arr[i-1];
        }
        arr[indexInsert] = x;
        System.out.println("New array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
