package christmas.test;

import christmas.discount.WeekendDiscount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WeekendDiscountTest {

    private WeekendDiscount weekendDiscount;

    @BeforeEach
    public void setUp() {
        weekendDiscount = new WeekendDiscount();
    }

    @Test
    public void testWeekendDiscountWithoutDiscount() {

        int weekday = 3;
        Map<String, Integer> categoryCount = new HashMap<>();
        categoryCount.put("main", 3);

        assertEquals(0, weekendDiscount.weekendDiscount(weekday, categoryCount));
    }

    @Test
    public void testWeekendDiscountWithDifferentCategory() {

        int weekendDay = 7;
        Map<String, Integer> categoryCount = new HashMap<>();
        categoryCount.put("desert", 2);

        assertEquals(0, weekendDiscount.weekendDiscount(weekendDay, categoryCount));
    }

}