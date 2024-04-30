package src.structural.p15_facade;

public class OrderFacade {
    private final ProductAvailablityService productAvailablityService;
    private final PaymentService paymentService;
    private final DeliveryService deliveryService;

    public OrderFacade(ProductAvailablityService productAvailablityService, PaymentService paymentService, DeliveryService deliveryService) {
        this.productAvailablityService = productAvailablityService;
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
    }

    public boolean placeOrder(Integer productId, int amount, String recipient) {
        if (productAvailablityService.isAvaible(productId)) {
            System.out.println("Product with id  " + productId + " is available.");
            paymentService.pay(productId, amount);
            deliveryService.deliveryProduct(productId, amount, recipient);
            return true;
        }
        System.out.println("Product with id  " + productId + " is not available.");
        return false;
    }
}
