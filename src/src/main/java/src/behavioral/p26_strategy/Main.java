package src.behavioral.p26_strategy;

public class Main {
    /*
    Chceme nahradit mezery v textu:
    a) nahradíme podtržítkem
    b) odtraníme mezery
    c) nahradíme 2 mezerami
     */

    public static void main(String[] args) {
        final StrategyType strategyType = StrategyType.DOUBLE;
        final String input = "Hello world! How are you?";

        final SpacesModificationStrategyProvider provider = new SpacesModificationStrategyProvider();

        SpacesModificationStrategy strategy = provider.get(strategyType);
        final String output = strategy.modify(input);
        System.out.println(output);
    }
}
