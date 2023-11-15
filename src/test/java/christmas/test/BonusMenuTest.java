package christmas.test;

import christmas.discount.BonusMenu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusMenuTest {

    @Test
    public void testBonusMenuWithHighPrice() {
        BonusMenu bonusMenu = new BonusMenu();
        bonusMenu.bonusMenu(130000);

        assertEquals("삼페인 1개", BonusMenu.getBonusMenu());
        assertEquals(25000, BonusMenu.getBonusMenuPrice());
    }
    @Test
    public void testBonusMenuWithLowPrice() {
        BonusMenu bonusMenu = new BonusMenu();
        bonusMenu.bonusMenu(100000);

        assertEquals("없음", BonusMenu.getBonusMenu());
        assertEquals(0, BonusMenu.getBonusMenuPrice());
    }
}