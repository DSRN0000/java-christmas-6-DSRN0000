package christmas.discount;

public class ChristmasDiscount {
    private int startDate = 1;
    private int endDate = 25;
    private int baseDiscountAmount = 1000;
    private int dailyDiscountIncrease = 100;

    private static int discountAmount;

    private int overDate = 0;


    public int calculateDiscountForDate(int currentDate) {
        if (validateCurrentNumber(currentDate) == true){
            int daysPassed = currentDate - startDate;
            discountAmount = baseDiscountAmount + (daysPassed * dailyDiscountIncrease);
            return discountAmount;
        }
        return overDate;
    }

    private boolean validateCurrentNumber(int currentDate){
        if (currentDate<endDate){
            return true;
        }
        return false;
    }

    public static int getChristmasDiscount(){
        return discountAmount;
    }

}
