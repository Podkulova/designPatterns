package src.structural.p13_decorator;

public class DisplayCounterDecorator implements FragStatistics{
    private FragStatistics fragStatistics;

    public DisplayCounterDecorator(FragStatistics fragStatistics) {
        this.fragStatistics = fragStatistics;
    }

    @Override
    public int incrementFragCount() {
        int fragCount = fragStatistics.incrementFragCount();
        System.out.println("Your frag is " + fragCount);
        return fragCount;
    }

    @Override
    public int incrementDeathCount() {
        int deathCount = fragStatistics.incrementDeathCount();
        System.out.println("Your death count is " + deathCount);
        return deathCount;
    }

    @Override
    public void reset() {
        fragStatistics.reset();
        System.out.println("Stats reset, frag count = 0, death count = 0");
    }
}
