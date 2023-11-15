package christmas.test;

import christmas.domain.SaveMenu;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SaveMenuTest {

    @Test
    public void testMenuInput() {
        SaveMenu saveMenu = new SaveMenu();


        String input = "제로콜라-2, 티본스테이크-3";
        Map<String, Integer> expectedOrder = new HashMap<>();
        expectedOrder.put("제로콜라", 2);
        expectedOrder.put("티본스테이크", 3);

        assertEquals(expectedOrder, saveMenu.menuInput(input));
    }
}