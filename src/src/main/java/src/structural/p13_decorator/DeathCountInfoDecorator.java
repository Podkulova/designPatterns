package src.structural.p13_decorator;

public class DeathCountInfoDecorator implements FragStatistics{
    private FragStatistics fragStatistics;

    public DeathCountInfoDecorator(FragStatistics fragStatistics) {
        this.fragStatistics = fragStatistics;
    }

    @Override
    public int incrementFragCount() {
        return fragStatistics.incrementFragCount();
    }

    @Override
    public int incrementDeathCount() {
        System.out.println("Fragged");
        return fragStatistics.incrementDeathCount();
    }

    @Override
    public void reset() {
        fragStatistics.reset();
    }
}
