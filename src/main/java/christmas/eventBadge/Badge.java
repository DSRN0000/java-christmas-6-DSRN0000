package christmas.eventBadge;

public enum Badge {
    NOTHING(0),
    스타(5000),
    트리(10000),
    산타(20000);

    private final int standardBenefitAmount;

    Badge(int standardBenefitAmount){
        this.standardBenefitAmount = standardBenefitAmount;
    }

    public Badge validateBadge(int totalBenefitAmount){
        if (standardBenefitAmount <= totalBenefitAmount){
            return this;
        }
        return NOTHING;
    }
}