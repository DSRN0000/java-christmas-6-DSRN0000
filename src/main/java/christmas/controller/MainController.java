package christmas.controller;

import christmas.discount.*;
import christmas.domain.CalculatePrice;
import christmas.domain.CategoryCount;
import christmas.domain.SaveMenu;
import christmas.view.*;

public class MainController {

    public void run(){
        inputDate();
        inputMenu();
        outputMenu();
        calculateAllPrice();
        giveawayEvent();
        benefit();
        allBenefitPrice();
        priceResult();
        getBadge();
    }

    private void inputDate(){
        InputDate inputDate = new InputDate();
        inputDate.inputDate();
    }

    private void inputMenu(){
        InputMenu inputMenu = new InputMenu();
        inputMenu.inputMenu();
    }

    private static void outputMenu(){
        OutputMenu outputMenu = new OutputMenu();
        SaveMenu saveMenu = new SaveMenu();
        saveMenu.menuInput(InputMenu.getMenu());
        outputMenu.outputMenu(SaveMenu.getOrder());
    }

    private static void calculateAllPrice(){
        OutputBeforeDiscountPrice outputBeforeDiscountPrice = new OutputBeforeDiscountPrice();
        CalculatePrice calculatePrice = new CalculatePrice();
        calculatePrice.calculatePrice(SaveMenu.getOrder());
        outputBeforeDiscountPrice.outputBeforeDiscountPrice(CalculatePrice.getTotalPrice());
    }

    private static void giveawayEvent(){
        BonusMenu bonus = new BonusMenu();
        OutputBonusMenu output = new OutputBonusMenu();
        bonus.bonusMenu(CalculatePrice.getTotalPrice());
        output.outputBonusMenu(BonusMenu.getBonusMenu());
    }

    private static void benefit(){
        CategoryCount categoryCount = new CategoryCount();

        ChristmasDiscount christmasDiscount = new ChristmasDiscount();
        WeekdayDiscount weekdayDiscount = new WeekdayDiscount();
        WeekendDiscount weekendDiscount = new WeekendDiscount();
        SpecialDiscount specialDiscount = new SpecialDiscount();

        OutputBenefit output = new OutputBenefit();

        categoryCount.countCategories(SaveMenu.getOrder());

        christmasDiscount.calculateDiscountForDate(InputDate.getDate());
        weekdayDiscount.weekdayDiscount(InputDate.getDate(),CategoryCount.getCategoryCount());
        weekendDiscount.weekendDiscount(InputDate.getDate(),CategoryCount.getCategoryCount());
        specialDiscount.starDayDiscount(InputDate.getDate());

        output.outputBenefit(ChristmasDiscount.getChristmasDiscount(),WeekdayDiscount.getWeekdayDiscount(),WeekendDiscount.getWeekendDiscount(),SpecialDiscount.getResult(),CalculatePrice.getTotalPrice());
    }

    private void allBenefitPrice(){
        OutputAllBenefitPrice outputAllBenefitPrice = new OutputAllBenefitPrice();
        outputAllBenefitPrice.outputAllBenefitPrice(ChristmasDiscount.getChristmasDiscount(),WeekdayDiscount.getWeekdayDiscount(),WeekendDiscount.getWeekendDiscount(),SpecialDiscount.getResult(),BonusMenu.getBonusMenuPrice());
    }

    private void priceResult(){
        OutputAfterDiscountPrice output = new OutputAfterDiscountPrice();
        FormatNumber format = new FormatNumber();
        output.outputAfterDiscountPrice(CalculatePrice.getTotalPrice(),OutputAllBenefitPrice.getAllBenefitPrice());
        format.formatNumber(OutputAfterDiscountPrice.getPrice());
    }

    private void getBadge(){
        OutputEventBadge output = new OutputEventBadge();
        output.outputEventBadge(OutputAllBenefitPrice.getAllBenefitPrice());
    }
}
