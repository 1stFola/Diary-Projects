package EStoreSuperMarket;

public enum CardType {
    MASTERCARD("Premium"),
    VISACARD("Gold"),
    VERVE("Silver"),
    AMERICAEXPRESS("Executive");

    private final String categoryClass;

    CardType(String categoryClass) {
        this.categoryClass = categoryClass;
    }

    public String getCategoryClass() {
        return categoryClass;
    }
}
