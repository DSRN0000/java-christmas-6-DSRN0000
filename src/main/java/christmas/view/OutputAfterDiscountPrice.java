package christmas.view;

import java.text.DecimalFormat;

public class OutputAfterDiscountPrice {
    private static final String OUTPUT = "<할인 후 예상 결제 금액>";
    private static int price = 0;

    public void outputAfterDiscountPrice(int allPrice, int discountPrice){
        print();
        calculatePrice(allPrice, discountPrice);
    }

    private void print(){
        System.out.println();
        System.out.println(OUTPUT);
    }

    private void calculatePrice(int allPrice, int discountPrice){
        if (120000 <= allPrice){
            price = allPrice - discountPrice + 25000;
        }
        if (allPrice <120000) {
            price = allPrice - discountPrice;
        }
    }

    private static void formatNumber(int number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        System.out.println(decimalFormat.format(number) + "원");
    }

    public static int getPrice(){
        return price;
    }
}
