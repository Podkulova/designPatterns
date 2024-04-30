package src.structural.p15_facade;

public class Delivery implements DeliveryService{
    private String name;

    public Delivery(String name) {
        this.name = name;
    }

    @Override
    public void deliveryProduct(Integer productId, int amount, String recipient) {
        System.out.println("Delivery product " + productId + " to " + recipient);
    }
}
