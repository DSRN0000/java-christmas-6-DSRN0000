package christmas.test;

import christmas.domain.CalculatePrice;
import christmas.menu.Menu;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CalculatePriceTest {

    private CalculatePrice calculatePrice;

    @BeforeEach
    public void setUp() {
        calculatePrice = new CalculatePrice();
    }

    @Test
    public void testCalculatePrice() {

        Map<String, Integer> order = new HashMap<>();
        order.put("양송이수프", 2);
        order.put("티본스테이크", 1);

        int expectedTotalPrice = Menu.양송이수프.getPrice() * 2 + Menu.티본스테이크.getPrice() * 1;
        assertEquals(expectedTotalPrice, calculatePrice.calculatePrice(order));
    }
}