package christmas.view;

public class OutputBenefit {

    private static final String OUTPUT = "<혜택 내역>";

    FormatNumber format = new FormatNumber();

    public void outputBenefit(int christmas, int weekday, int weekend, int special, int allPrice){
       output();
       validate(christmas, weekday, weekend, special, allPrice);
    }

    private void output(){
        System.out.println();
        System.out.println(OUTPUT);
    }

    public void validate(int christmas, int weekday, int weekend, int special, int allPrice){
        boolean hasDiscount = false;

        if(christmas != 0 ){
            christmasDiscount(christmas);
            hasDiscount = true;
        }

        if (weekday != 0){
            weekdayDiscount(weekday);
            hasDiscount = true;
        }

        if (weekend != 0){
            weekendDiscount(weekend);
            hasDiscount = true;
        }

        if (special != 0){
            specialDiscount(special);
            hasDiscount = true;
        }

        if (12000 <= allPrice){
            bonusMenuDiscount(allPrice);
        }

        if (!hasDiscount){
            System.out.println("없음");
        }
    }

    private void christmasDiscount(int discount){
        if (10000 <= discount){
            System.out.println("크리스마스 디데이 할인: -" + format.formatNumber(discount) + "원");
        }
    }
    private void weekdayDiscount(int discount){
        if (10000 <= discount){
            System.out.println("평일할인: -" + format.formatNumber(discount) + "원");
        }
    }
    private void weekendDiscount(int discount){
        if (10000 <= discount){
            System.out.println("주말할인: -" + format.formatNumber(discount) + "원");
        }
    }
    private void specialDiscount(int discount){
        if (10000 <= discount){
            System.out.println("특별할인: -" + format.formatNumber(discount) + "원");
        }
    }
    private void bonusMenuDiscount(int input){
        if (120000 <= input){
            System.out.println("증정 이벤트: -25,000원");
        }
    }
}
