package christmas.view;

public class OutputAllBenefitPrice {
    private static final String OUTPUT = "<총혜택 금액>";
    private static int allBenefit = 0;

    FormatNumber format = new FormatNumber();

    public void outputAllBenefitPrice(int christmas,int weekday, int weekend, int special, int benefit){
        print();
        allBenefitPrice(christmas, weekday, weekend, special, benefit);
    }

    private void print(){
        System.out.println();
        System.out.println(OUTPUT);
    }

    private void allBenefitPrice(int christmas,int weekday, int weekend, int special, int benefit){
        allBenefit = christmas + weekday + weekend + special + benefit;
        if (0 < allBenefit){
            System.out.println("-" + format.formatNumber(allBenefit) + "원");
        }
        if (allBenefit == 0) {
            System.out.println(format.formatNumber(allBenefit) + "원");
        }
    }

    public static int getAllBenefitPrice(){
        return allBenefit;
    }
}
