package christmas.discount;

public class BonusMenu {

    private static String bonusMenu = "";
    private static int bonusMenuPrice = 0;

    public void bonusMenu(int price){
        calculate(price);
    }

    private void calculate(int price){
        if (120000 <= price){
            bonusMenu = "삼페인 1개";
            bonusMenuPrice = 25000;
        }
        if (price < 120000) {
            bonusMenu =  "없음";
            bonusMenuPrice = 0;
        }
    }

    public static String getBonusMenu(){
        return bonusMenu;
    }
    public static int getBonusMenuPrice(){
        return bonusMenuPrice;
    }
}
