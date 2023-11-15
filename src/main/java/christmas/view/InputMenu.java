package christmas.view;

import camp.nextstep.edu.missionutils.Console;
import christmas.menu.Menu;
import christmas.message.ErrorMessage;

import java.util.HashMap;
import java.util.Map;

public class InputMenu {
    private static final String ASK_MENU = "주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)";
    private static final String EVENT_MESSAGE = "12월 %d일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!";

    private static String menu;
    Map<String, Integer> menuCountMap = new HashMap<>();
    int totalItems = 0;

    public void inputMenu(){
        System.out.println(ASK_MENU);
        menu = Console.readLine();
        validateInputMenu(menu);
        System.out.printf((EVENT_MESSAGE) , InputDate.getDate());
        System.out.println();
    }

    private void validateInputMenu(String menu) {
        String[] menuItems = menu.split(",");

        for (String menuItem : menuItems) {
            String[] parts = menuItem.trim().split("-");
            if (parts.length != 2 || !isNumeric(parts[1])) {
                throw new IllegalArgumentException(ErrorMessage.MENU_ERROR);
            }
            String menuName = parts[0].toLowerCase(); // 대소문자 구분 없이 비교
            int quantity = Integer.parseInt(parts[1]);

            if (!isValidMenu(menuName, quantity)) {
                throw new IllegalArgumentException(ErrorMessage.MENU_ERROR);
            }

            totalItems += quantity;
            if (totalItems > 20) {
                throw new IllegalArgumentException(ErrorMessage.MENU_ERROR);
            }

            menuCountMap.put(menuName, menuCountMap.getOrDefault(menuName, 0) + quantity);
        }
    }

    private boolean isValidMenu(String menuName, int quantity) {
        for (Menu menu : Menu.values()) {
            if (menu.name().equalsIgnoreCase(menuName)) {
                if (menu.getCategory().equalsIgnoreCase("drink") && quantity > 1) {
                    throw new IllegalArgumentException(ErrorMessage.MENU_ERROR);
                }
                return true;
            }
        }
        throw new IllegalArgumentException(ErrorMessage.MENU_ERROR);
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String getMenu(){
        return menu;
    }
}
