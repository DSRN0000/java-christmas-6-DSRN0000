package christmas.domain;

import christmas.menu.Menu;

import java.util.Map;

public class CalculatePrice {
    private static int totalPrice;

    public int calculatePrice(Map<String, Integer> order) {
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            String menuName = entry.getKey();
            int quantity = entry.getValue();

            for (Menu menu : Menu.values()) {
                if (menu.name().equals(menuName)) {
                    int itemPrice = menu.getPrice();
                    totalPrice += itemPrice * quantity;
                    break;
                }
            }
        }
        return totalPrice;
    }


    public static int getTotalPrice(){
        return totalPrice;
    }
}
