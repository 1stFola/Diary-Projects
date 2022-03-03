package EStoreSuperMarket;

public class Item {

    private int quantity;
    private Product productBought;

    public Item(int quantity, Product productBought) {
        this.quantity = quantity;
        this.productBought = productBought;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProductBought() {
        return productBought;
    }

    public void setProductBought(Product productBought) {
        this.productBought = productBought;
    }
}
