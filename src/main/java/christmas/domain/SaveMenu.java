package christmas.domain;

import christmas.menu.Menu;

import java.util.HashMap;
import java.util.Map;

public class SaveMenu {

    private static Map<String, Integer> order = new HashMap<>();

    public Map<String, Integer> menuInput(String input){

        String[] items = input.split(",");
        for (String item : items){
            String[] parts = item.trim().split("-");
            if (parts.length == 2){
                String itemName = parts[0];
                int quantity = Integer.parseInt(parts[1]);

                order.put(itemName, quantity);
            }
        }
        return order;
    }

    public static Map<String, Integer> getOrder(){
        return order;
    }
}
