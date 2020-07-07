package ngay3;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indexDel;
        System.out.println("Enter the numbers of array : ");
        int numb = scanner.nextInt();
        int [] arr = new int[numb];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) Math.round(Math.random()*20);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("Enter the number you want remove : ");
        int x = scanner.nextInt();
        do {
            indexDel = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    indexDel = i;
                    break;
                }
            }
            if (indexDel != -1) {
                for (int i = indexDel; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[numb - 1] = -1;
            }
        } while (indexDel != -1);

        System.out.println("New array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
