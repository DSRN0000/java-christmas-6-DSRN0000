package christmas.discount;

import christmas.day.Weekend;

import java.util.Calendar;
import java.util.Map;

public class WeekendDiscount {
    private final int discount = 2023;
    private static int discountAmount;
    private int noDiscount = 0;

    public int weekendDiscount(int day, Map<String, Integer> categoryCount){
        String dayOfWeek = getDayOfWeek(day);
        if(isWeekend(dayOfWeek)){
            discountAmount = calWeekendDiscount(categoryCount);
            return discountAmount;
        }

        return noDiscount;
    }

    private String getDayOfWeek(int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.DECEMBER, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        if (dayOfWeek == Calendar.FRIDAY){
            return "friday";
        }
        if(dayOfWeek == Calendar.SATURDAY){
            return "saturday";
        }
        return "";
    }

    private int calWeekendDiscount(Map<String, Integer> input){
        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            String category = entry.getKey();
            int quantity = entry.getValue();

            if ("main".equals(category)){
                discountAmount +=  discount * quantity;
            }
        }
        return discountAmount;
    }

    private boolean isWeekend(String day){
        for (Weekend weekend : Weekend.values()) {
            if (weekend.name().equalsIgnoreCase(day)) {
                return true;
            }
        }
        return false;
    }

    public static int getWeekendDiscount(){
        return discountAmount;
    }

}
