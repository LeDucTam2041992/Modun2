package ngay3;

import java.util.Scanner;

public class CountTheChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();
        System.out.println("Enter the chart you want to count : ");
        char c = scanner.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
                System.out.printf("Position %d in the string same the char '%c'\n",i,c);
            }
        }
        System.out.printf("The times of char '%c' appear in the string '%s' is %d times",c,str,count);
    }
}
