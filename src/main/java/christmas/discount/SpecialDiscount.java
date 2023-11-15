package christmas.discount;

import christmas.day.SpecialDay;

public class SpecialDiscount {
    private final int discount = 1000;
    private final int noDiscount = 0;

    private static int result;

    public void starDayDiscount(int day){
        if (isStarDay(day) == true){
            result = discount;
        }
        if (isStarDay(day) != true) {
            result = noDiscount;
        }
    }

    private boolean isStarDay(int day){
        for (SpecialDay specialDay : SpecialDay.values()) {
            if (specialDay.ordinal() + 1 == day) {
                return true;
            }
        }
        return false;
    }

    public static int getResult(){
        return result;
    }

}
