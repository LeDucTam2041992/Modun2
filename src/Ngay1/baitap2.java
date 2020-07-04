package Ngay1;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = new String();
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        if (number < 0) {
            result = "Out of ability";}
//        } else if (number <= 10) result = unit(number);
        if (0 < number && number < 100) result = dou(number);
        if (100 <= number && number < 1000) result = Hund(number);
        if (1000 <= number && number <100000) result = Thou(number);
        System.out.println(result);
    }


    private static String Unit(int numb) {
        String res;
        switch (numb) {
            case 1:
                res = "one";
                break;
            case 2:
                res = "two";
                break;
            case 3:
                res = "three";
                break;
            case 4:
                res = "four";
                break;
            case 5:
                res = "five";
                break;
            case 6:
                res = "six";
                break;
            case 7:
                res = "seven";
                break;
            case 8:
                res = "eight";
                break;
            case 9:
                res = "nine";
                break;
            case 10:
                res = "ten";
                break;
            default:res = "";
        }
        return res;
    }
    private static String dou(int numb){
        String res;
        int x = (numb - numb%10)/10;
        switch (x) {
            case 0:
                res = Unit(numb);
                break;
            case 1:
                switch (numb) {
                    case 10:
                        res = "ten";
                        break;
                    case 11:
                        res = "eleven";
                        break;
                    case 12:
                        res = "twelve";
                        break;
                    case 13:
                        res = "thirteen";
                        break;
                    case 15:
                        res = "fifteen";
                        break;
                    case 18 :
                        res = "eighteen";
                        break;
                    default: res = Unit(numb%10) + "teen";
                }
                break;
            case 2:
                res = "twenty " + Unit(numb%10);
                break;
            case 3:
                res = "thirty " + Unit(numb%10);
                break;
            case 4:
                res = "forty " + Unit(numb%10);
                break;
            case 5:
                res = "fifty " + Unit(numb%10);
                break;
            case 8:
                res = "eighty " + Unit(numb%10);
                break;
            default:res = Unit(x) + "ty " + Unit(numb%10);
        }
        return res;
    }
    private static String Hund(int numb) {
        String res;
        if (numb % 100 == 0) {
            res = Unit(numb / 100) + " hundred ";
        } else {
            res = Unit((numb - numb % 100) / 100) + " hundred and " + dou(numb % 100);
        }
        return res;
    }
    private static String Thou(int numb) {
        String res;
        if (numb %1000 ==0 && numb <=100000) {
            res = dou(numb/1000) + " thousand ";
        } else {
            res = dou((numb-numb%1000)/1000) + " thousand " + Hund(numb%1000);
        }
        return res;
    }
}
