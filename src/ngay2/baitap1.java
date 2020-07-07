package ngay2;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice,select,size;
        do {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle ");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("Enter the length = ");
                    int length = scanner.nextInt();
                    System.out.println("Enter the width = ");
                    int width = scanner.nextInt();
                    for (int i = 0; i < width ; i++) {
                        for (int j = 0; j < length ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2 :
                    do {
                        System.out.println("1. The corner is square bot-left");
                        System.out.println("2. The corner is square top-left");
                        System.out.println("0. Return the menu!");
                        System.out.println("Select the square triangle you want draw :");
                        select = scanner.nextInt();
                        switch (select){
                            case 1 :
                                System.out.println("Enter the size of square triangle = ");
                                size = scanner.nextInt();
                                for (int i = 0; i < size ; i++) {
                                    for (int j = 0; j < i+1 ; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2 :
                                System.out.println("Enter the size of square triangle = ");
                                size = scanner.nextInt();
                                for (int i = size; i > 0; i--) {
                                    for (int j = i; j > 0 ; j--) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 0 :
                                System.out.println("--------------------------------------------------");
                                break;
                            default:
                                System.out.println("No choice!");
                        }
                    } while (select!=0);
                    break;

                case 3 :
                    System.out.println("Enter the size of isosceles triangle :");
                    size = scanner.nextInt();
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < (size - i) ; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i+1 ; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                case 0 :
                    System.out.println("--------------------------------------------------");
                    break;
                default:
                    System.out.println("No choice !");
            }
        } while (choice!=0);
    }
}
