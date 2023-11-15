package christmas.view;

import java.util.Map;

public class OutputMenu {
    private static final String OUTPUT = "<주문 메뉴>";

    public void outputMenu(Map<String, Integer> order){
        output();
        Menu(order);
        System.out.println();
    }

    private void output(){
        System.out.println();
        System.out.println(OUTPUT);
    }

    public void Menu(Map<String, Integer> order) {
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(itemName + " " +quantity + "개");
        }
    }
}
