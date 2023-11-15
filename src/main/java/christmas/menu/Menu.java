package christmas.menu;

public enum Menu {
    양송이수프("appetizer", 6000),
    타파스("appetizer", 5500),
    시저샐러드("appetizer", 8000),

    티본스테이크("main",55000),
    바비큐립("main",54000),
    해산물파스타("main",35000),
    크리스마스파스타("main",25000),

    초코케이크("desert",15000),
    아이스크림("desert",5000),

    제로콜라("drink",3000),
    레드와인("drink",60000),
    샴페인("drink",25000);

    private final String category;
    private final int price;

    Menu(String category,int price){
        this.category = category;
        this.price = price;
    }

    public String getCategory(){
        return category;
    }
    public int getPrice(){
        return price;
    }
}
