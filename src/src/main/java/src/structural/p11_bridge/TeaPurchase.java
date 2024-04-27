package src.structural.p11_bridge;

public class TeaPurchase implements DrinkPurchase{
    @Override
    public Drink buy(Double coast) {
        System.out.println("Buying a tea with price of " + coast);
        return new Tea();
    }
}
