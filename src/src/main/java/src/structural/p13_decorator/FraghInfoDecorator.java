package src.structural.p13_decorator;

public class FraghInfoDecorator implements FragStatistics{
    private FragStatistics fragStatistics;

    public FraghInfoDecorator(FragStatistics fragStatistics) {
        this.fragStatistics = fragStatistics;
    }

    @Override
    public int incrementFragCount() {
        System.out.println("Enemy fragged");
        return fragStatistics.incrementFragCount();
    }

    @Override
    public int incrementDeathCount() {
        return fragStatistics.incrementDeathCount();
    }

    @Override
    public void reset() {
        fragStatistics.reset();
    }
}
