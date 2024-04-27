package src.structural.p11_bridge;

public class Main {
    public static void main(String[] args) {
        CoffeePurchase coffeePurchase = new CoffeePurchase();
        Drink coffe = coffeePurchase.buy(2.8);
        System.out.println(coffe);

        System.out.println("_________________________");

        TeaPurchase teaPurchase = new TeaPurchase();
        Drink tea = teaPurchase.buy(2.4);
        System.out.println(tea);

    }
}
