package ngay9_baitap1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {

    @Test
    @DisplayName("day1/1/2018")
    public void day1month1year2018() {
        String day = "1/1/2018";
        String expected = "2/1/2018";
        String result = NextDayCalculator.nextDay(day);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("day31/1/2018")
    public void day31month1year2018() {
        String day = "31/1/2018";
        String expected = "1/2/2018";
        String result = NextDayCalculator.nextDay(day);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("day30/4/2018")
    public void day30month4year2018() {
        String day = "30/4/2018";
        String expected = "1/5/2018";
        String result = NextDayCalculator.nextDay(day);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("day28/2/2018")
    public void day28month2year2018() {
        String day = "28/2/2018";
        String expected = "1/3/2018";
        String result = NextDayCalculator.nextDay(day);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("day29/2/2020")
    public void day29month2year2020() {
        String day = "29/2/2020";
        String expected = "1/3/2020";
        String result = NextDayCalculator.nextDay(day);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("day31/12/2020")
    public void day31month12year2020() {
        String day = "31/12/2018";
        String expected = "1/1/2019";
        String result = NextDayCalculator.nextDay(day);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("day33/12/2020")
    public void day33month12year2020() {
        String day = "33/12/2018";
        String expected = "Data not invalid!";
        String result = NextDayCalculator.nextDay(day);
        assertEquals(expected, result);
    }


}
