package ngay9_baitap1;

public class NextDayCalculator {
    public static String nextDay(String s) {
        String nextDay="";
        String[] datas = s.split("/");
        int day = Integer.parseInt(datas[0]);
        int month = Integer.parseInt(datas[1]);
        int year = Integer.parseInt(datas[2]);

        boolean isDay = day>0 && day<32;
        boolean isMonth = month>0 && month<13;
        boolean isYear = year>0 && year<10000;

        if(!isDay || !isMonth || !isYear) return "Data not invalid!";
        if (month == 2) return monthFebruary(day,month,year);
        if (month == 4 || month == 6 || month ==9 || month == 11) return monthHave30Day(day,month,year);
        return monthHave31Day(day,month,year);
    }

    private static boolean isLeapYear(int year){
        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    private static String monthHave31Day (int day, int month, int year) {

        if (day == 31 && month !=12) {
            day = 1;
            month+=1;
            return day + "/" + month + "/" + year;
        }
        if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year+=1;
            return day + "/" + month + "/" + year;
        }
        day+=1;
        return day + "/" + month + "/" + year;
    }


    private static String monthHave30Day (int day, int month, int year) {

        if (day == 30) {
            day = 1;
            month += 1;
            return day + "/" + month + "/" + year;
        }
        day+=1;
        return day + "/" + month + "/" + year;
    }

    private static String monthFebruary(int day, int month, int year) {
        if (day > 29) return "data is not invalid!";
        if (isLeapYear(year)) if (day==29){
            day = 1;
            month+=1;
            return day + "/" + month + "/" + year;
        } else {
            day+=1;
            return day + "/" + month + "/" + year;
        }
        if(day==28) {
            day = 1;
            month+=1;
            return day + "/" + month + "/" + year;
        } else {
            day += 1;
            return day + "/" + month + "/" + year;
        }
    }
}
