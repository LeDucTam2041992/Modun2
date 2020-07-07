package ngay9_baitap3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {

    @Test
    @DisplayName("Test-FizzBuzz")
    public void testFizzBuzz(){
        int a = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected,result);
    }


    @Test
    @DisplayName("Test-Fizz")
    public void testFizz(){
        int a = 12;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected,result);
    }


    @Test
    @DisplayName("Test-Buzz")
    public void testBuzz(){
        int a = 25;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected,result);
    }


    @Test
    @DisplayName("Test-non")
    public void testNon(){
        int a = 14;
        String expected = "14";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected,result);
    }
}
