package christmas.domain;

import christmas.menu.Menu;

import java.util.HashMap;
import java.util.Map;

public class CategoryCount {
    private static Map<String, Integer> categoryCount = new HashMap<>();

    public Map<String, Integer> countCategories(Map<String, Integer> menu) {

        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();

            String category = getCategory(itemName);
            categoryCount.put(category, categoryCount.getOrDefault(category, 0) + quantity);
        }

        return categoryCount;
    }

    private String getCategory(String itemName) {
        for (Menu menu : Menu.values()) {
            if (menu.name().equalsIgnoreCase(itemName)) {
                return menu.getCategory();
            }
        }
        return "";
    }

    public static Map<String, Integer> getCategoryCount(){
        return categoryCount;
    }
}
