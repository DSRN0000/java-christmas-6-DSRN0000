package christmas.view;

public class OutputEventBadge {
    private static final String OUTPUT = "<12월 이벤트 배지>";

    public void outputEventBadge(int benefitPrice){
        print();
        getBadge(benefitPrice);
    }

    private void print(){
        System.out.println();
        System.out.println(OUTPUT);
    }

    private void getBadge(int benefitPrice){
        if (5000 <= benefitPrice && benefitPrice < 10000){
            System.out.println("별");
        }
        if (10000 <= benefitPrice && benefitPrice < 20000){
            System.out.println("트리");
        }
        if (20000 <= benefitPrice ) {
            System.out.println("산타");
        }
        if (benefitPrice < 5000) {
            System.out.println("없음");
        }
    }
}
