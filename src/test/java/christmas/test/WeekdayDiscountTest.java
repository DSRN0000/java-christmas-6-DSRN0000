package christmas.test;

import christmas.discount.WeekdayDiscount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WeekdayDiscountTest {

    private WeekdayDiscount weekdayDiscount;

    @BeforeEach
    public void setUp() {
        weekdayDiscount = new WeekdayDiscount();
    }

    @Test
    public void testWeekdayDiscountWithoutDiscount() {

        int weekendDay = 1;
        Map<String, Integer> categoryCount = new HashMap<>();
        categoryCount.put("desert", 3);
        assertEquals(0, weekdayDiscount.weekdayDiscount(weekendDay, categoryCount));
    }

    @Test
    public void testWeekdayDiscountWithDifferentCategory() {

        int weekday = 3;
        Map<String, Integer> categoryCount = new HashMap<>();
        categoryCount.put("main", 2);

        assertEquals(0, weekdayDiscount.weekdayDiscount(weekday, categoryCount));
    }

}