package christmas.discount;

import christmas.day.Weekday;

import java.util.Calendar;
import java.util.Map;

public class WeekdayDiscount {
    private final int discount = 2023;

    private static int discountAmount;
    private int noDiscount = 0;

    public int weekdayDiscount(int day, Map<String, Integer> categoryCount){
        String dayOfWeek = getDayOfWeek(day);
        if (isWeekday(dayOfWeek)){
            discountAmount = calWeekdayDiscount(categoryCount);
            return discountAmount;
        }
        return noDiscount;
    }

    private String getDayOfWeek(int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.DECEMBER, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        if (dayOfWeek == Calendar.SUNDAY) {
            return "sunday";
        }
        if (dayOfWeek == Calendar.MONDAY) {
            return "monday";
        }
        if (dayOfWeek == Calendar.TUESDAY) {
            return "tuesday";
        }
        if (dayOfWeek == Calendar.WEDNESDAY) {
            return "wednesday";
        }
        if (dayOfWeek == Calendar.THURSDAY) {
            return "thursday";
        }

        return "";
    }


    private int calWeekdayDiscount(Map<String, Integer> input){
        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            String category = entry.getKey();
            int quantity = entry.getValue();

            if ("desert".equals(category)){
                discountAmount +=  discount * quantity;
            }
        }
        return discountAmount;
    }

    private boolean isWeekday(String day){
        for (Weekday weekday : Weekday.values()) {
            if (weekday.name().equalsIgnoreCase(day)) {
                return true;
            }
        }
        return false;
    }

    public static int getWeekdayDiscount(){
        return discountAmount;
    }
}
