package christmas.view;

public class OutputBeforeDiscountPrice {
    private static final String OUTPUT = "<할인 전 총주문 금액>";

    FormatNumber format = new FormatNumber();
    public void outputBeforeDiscountPrice(int price){
        output();
        allPrice(price);
        System.out.println();
    }

    private void output(){
        System.out.println(OUTPUT);
    }

    private void allPrice(int price){
        System.out.println(format.formatNumber(price) + "원");
    }

}
