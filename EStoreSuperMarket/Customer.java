package EStoreSuperMarket;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Customer extends User {

    private BillingInformation billingInfo;
    private ArrayList<Item> shoppingCart = new ArrayList<>();


    // THIS CONSTRUCTOR IS NOT REALLY NECESSARY BECAUSE THE MOTHERS' CONSTRUCTOR CAN SUFFICE FOR CREATING A CUSTOMER PROFILE
//    public Customer(LocalDateTime age, String emailAddress, UserAddress homeAddress, String name,
//                    String password, String phone, BillingInformation billingInfo, ArrayList<Item> shoppingCart) {

//        super(age, emailAddress, homeAddress, name, password, phone);

//        this.billingInfo = billingInfo;
//        this.shoppingCart = shoppingCart;
//
//    }

    public BillingInformation getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(BillingInformation billingInfo) {
        this.billingInfo = billingInfo;
    }

    public ArrayList<Item> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Item> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
