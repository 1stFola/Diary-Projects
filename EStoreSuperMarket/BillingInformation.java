package EStoreSuperMarket;

public class BillingInformation {

    private String receiverPhoneNumber;
    private String receiverName;
    private String deliveryAddress;
    private String creditCardInformation;

    public BillingInformation(String receiverPhoneNumber, String receiverName, String deliveryAddress, String creditCardInformation) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;
        this.creditCardInformation = creditCardInformation;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(String creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }
}
