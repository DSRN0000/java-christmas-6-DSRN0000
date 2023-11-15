package christmas.test;

import christmas.domain.CategoryCount;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CategoryCountTest {
    private CategoryCount categoryCount;

    @BeforeEach
    public void setUp() {
        categoryCount = new CategoryCount();
    }

    @Test
    public void testCountCategories() {

        Map<String, Integer> menuOrder = new HashMap<>();
        menuOrder.put("양송이수프", 2);
        menuOrder.put("티본스테이크", 1);

        Map<String, Integer> expectedCategoryCount = new HashMap<>();
        expectedCategoryCount.put("appetizer", 2);
        expectedCategoryCount.put("main", 1);

        assertEquals(expectedCategoryCount, categoryCount.countCategories(menuOrder));
    }
}