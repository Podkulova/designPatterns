package src.structural.p15_facade;

public class Main {
    public static void main(String[] args) {
        ProductAvailability productAvailability = new ProductAvailability();
        Payment payment = new Payment("Cash");
        Delivery delivery = new Delivery("Delivery service 1");

        OrderFacade orderFacade = new OrderFacade(productAvailability, payment, delivery);
        orderFacade.placeOrder(150, 3, "Anežka Nová, Modrá 45, Ostrava.");
        orderFacade.placeOrder(10, 1, "petr Novák, Mastná 4, Brno.");
    }
}
