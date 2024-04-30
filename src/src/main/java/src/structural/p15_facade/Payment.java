package src.structural.p15_facade;

public class Payment implements PaymentService{
    private String type; // byl by lepší enum

    public Payment(String type) {
        this.type = type;
    }

    @Override
    public void pay(Integer productId, int amount) {
        System.out.println("Product " + productId + " paid.");
    }
}
