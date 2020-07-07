package ngay2;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int prime = 2;
        System.out.println("Enter number prime you want to write : ");
        int numbers = scanner.nextInt();
        while (count <= numbers) {
            if (CheckPrime(prime)) {
                System.out.printf("%-10d",prime);
                count++;
                if (count%10 == 0) System.out.println();
            }
            prime++;
        }
    }

    private static boolean CheckPrime(int number){
        if (number < 2)
            return false;
        else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
}
