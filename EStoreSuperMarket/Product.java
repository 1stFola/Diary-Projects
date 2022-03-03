package EStoreSuperMarket;

public class Product {

    private String productId;
    private String productName;
    private double price;
    private String productDescription;
    private ProductCategory prodCategory;

    public Product(String productId, String productName, double price, String productDescription, ProductCategory prodCategory) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.prodCategory = prodCategory;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public ProductCategory getProdCategory() {
        return prodCategory;
    }

    public void setProdCategory(ProductCategory prodCategory) {
        this.prodCategory = prodCategory;
    }
}
