package src.structural.p15_facade;

public class OrderFacade2 implements Order {
    private final ProductAvailability productAvailability;
    private final Payment payment;
    private final Delivery delivery;

    public OrderFacade2(ProductAvailability productAvailability, Payment payment, Delivery delivery) {
        this.productAvailability = productAvailability;
        this.payment = payment;
        this.delivery = delivery;
    }

    @Override
    public boolean isAvailable(Integer productId) {
        return productAvailability.isAvaible(productId);
    }

    @Override
    public void pay(Integer productId, int amount) {
        payment.pay(productId, amount);
        System.out.println("Product id " + productId + " paid.");
    }
    @Override
    public void deliveryProduct(Integer productId, int amount, String recipient) {
        delivery.deliveryProduct(productId, amount, recipient);
        System.out.println("Product id " + productId + " delivered.");
    }


}
