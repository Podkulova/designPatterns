package src.creational.p02_singelton_enum;

public class Main {
    public static void main(String[] args) {
        SimpleCounter simpleCounterA = SimpleCounter.INSTANCE;
        SimpleCounter simpleCounterB = SimpleCounter.INSTANCE;

        System.out.println("simpleCounterA: " + simpleCounterA);
        System.out.println("simpleCounterB: " + simpleCounterB);

        System.out.println("Are counter same? " + (simpleCounterA == simpleCounterB));

        simpleCounterA.increment(); // zvýšíme currenCounter na 1
        simpleCounterB.increment(); // zvýšíme currenCounter na 2

        System.out.println("Current count: " + simpleCounterA.getCurrentCount());

    }
}
