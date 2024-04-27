package src.structural.p11_bridge;

public class CoffeePurchase implements DrinkPurchase{
    @Override
    public Drink buy(Double coast) {
        System.out.println("Buying a coffe with price of " + coast);
        return new Coffee();
    }
}
