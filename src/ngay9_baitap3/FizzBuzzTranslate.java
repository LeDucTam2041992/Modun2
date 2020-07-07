package ngay9_baitap3;

public class FizzBuzzTranslate {
    public static String translate(int number) {
        if (number <= 0) return "Data is not invalid!";
        if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return "" + number;
    }
}
