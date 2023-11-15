package christmas.test;

import christmas.discount.ChristmasDiscount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasDiscountTest {

    @Test
    public void testCalculateDiscountForDate() {
        ChristmasDiscount christmasDiscount = new ChristmasDiscount();

        int currentDateWithinDiscountPeriod = 10;
        int expectedDiscountForDateWithinPeriod = 1000 + (currentDateWithinDiscountPeriod - 1) * 100;
        assertEquals(expectedDiscountForDateWithinPeriod, christmasDiscount.calculateDiscountForDate(currentDateWithinDiscountPeriod));


        int currentDateAfterDiscountPeriod = 30;
        assertEquals(0, christmasDiscount.calculateDiscountForDate(currentDateAfterDiscountPeriod));
    }


    @Test
    public void testGetChristmasDiscount() {
        ChristmasDiscount christmasDiscount = new ChristmasDiscount();

        int expectedDiscount = ChristmasDiscount.getChristmasDiscount();
        assertEquals(expectedDiscount, christmasDiscount.getChristmasDiscount());
    }
}