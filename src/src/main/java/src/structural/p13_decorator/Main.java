package src.structural.p13_decorator;

public class Main {
    public static void main(String[] args) {
        FragStatistics fragStatistics = new FirstPersonShooterStatistics();

        fragStatistics.incrementDeathCount();
        fragStatistics.incrementFragCount();

        FragStatistics decoratedStatistic =
                new FragDeathRatioDecorator(
                        new FraghInfoDecorator(
                                new DisplayCounterDecorator(
                                        new DeathCountInfoDecorator(
                                                fragStatistics
                                        )
                                )
                        )
                );

        decoratedStatistic.incrementFragCount();
        System.out.println("____________________");
        decoratedStatistic.incrementFragCount();
        System.out.println("____________________");
        decoratedStatistic.incrementDeathCount();
        System.out.println("____________________");
        decoratedStatistic.incrementDeathCount();
        System.out.println("____________________");
        decoratedStatistic.reset();

    }
}
