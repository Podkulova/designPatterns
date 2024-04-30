package src.structural.p15_facade;

public class Main {
    public static void main(String[] args) {
        ProductAvailability productAvailability = new ProductAvailability();
        Payment payment = new Payment("Cash");
        Delivery delivery = new Delivery("Delivery service 1");

        // První přístup:
        OrderFacade orderFacade = new OrderFacade(productAvailability, payment, delivery);
        orderFacade.placeOrder(150, 3, "Anežka Nová, Modrá 45, Ostrava.");
        orderFacade.placeOrder(10, 1, "petr Novák, Mastná 4, Brno.");

        System.out.println("---------------------------------------");

        // Druhý přístup:
        OrderFacade2 orderFacade2 = new OrderFacade2(productAvailability, payment, delivery);
        Integer productId = 25;
        int amount = 2;

        if (orderFacade2.isAvailable(productId)) {
            orderFacade2.pay(productId, amount);
            orderFacade2.deliveryProduct(productId, amount, "Honza Prostý, Opalová 14, Praha");
        } else {
            System.out.println("Product id " + productId + " is not avaible.");
        }
    }
}
