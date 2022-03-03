package EStoreSuperMarket;

public enum ProductCategory {

    ELECTRONICS("Samsung", "TV"),
    GROCERIES("Nestle", "Chocolate"),
    UTENSILS("Eleganza", "Jug"),
    CLOTHING("Nike", "Shirt");

    private final String categoryTitle;
    private final String categoryClass;

    ProductCategory(String categoryTitle, String categoryClass) {
        this.categoryTitle = categoryTitle;
        this.categoryClass = categoryClass;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public String getCategoryClass() {
        return categoryClass;
    }
}
