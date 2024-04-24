package src.creational_p01_singelton_eager;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Eager singleton example: ");

        SimpleCounter simpleCounterA = SimpleCounter.getInstance();
        SimpleCounter simpleCounterB = SimpleCounter.getInstance();

        System.out.println("simpleCounterA: " + simpleCounterA);
        System.out.println("simpleCounterB: " + simpleCounterB);

        System.out.println("Are counter same? " + (simpleCounterA == simpleCounterB));

        simpleCounterA.increment(); // zvýšíme currenCounter na 1
        simpleCounterB.increment(); // zvýšíme currenCounter na 2

        System.out.println("Current count: " + simpleCounterA.getCurrentCount());

    }
}
