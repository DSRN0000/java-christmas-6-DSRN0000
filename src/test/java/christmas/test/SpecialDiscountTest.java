package christmas.test;

import christmas.discount.SpecialDiscount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialDiscountTest {

    @Test
    public void testStarDayDiscountWithDiscount() {
        SpecialDiscount specialDiscount = new SpecialDiscount();

        int specialDayWithDiscount = 1;
        specialDiscount.starDayDiscount(specialDayWithDiscount);
        assertEquals(1000, SpecialDiscount.getResult());
    }

}