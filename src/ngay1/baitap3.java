package ngay1;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        final int rate = 23000;
        System.out.print("Enter your dollars : ");
        float uSD = scanner.nextFloat();
        float vND = rate*uSD;
        System.out.printf("Your VND = %10.0f vnd",vND);
    }
}
