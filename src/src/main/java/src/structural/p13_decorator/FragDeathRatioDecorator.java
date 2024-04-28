package src.structural.p13_decorator;

public class FragDeathRatioDecorator implements FragStatistics{
    private FragStatistics fragStatistics;
    private Integer currentFragCount = null;
    private Integer currentDeatCount = null;

    public FragDeathRatioDecorator(FragStatistics fragStatistics) {
        this.fragStatistics = fragStatistics;
    }

    private void displayFregDeathRatio() {
        if (currentFragCount != null && currentDeatCount != null) {
            System.out.println("DeathRatio = " + 1.0 * currentFragCount/currentDeatCount);
        }
    }

    @Override
    public int incrementFragCount() {
        currentFragCount = fragStatistics.incrementFragCount();
        return currentFragCount;
    }

    @Override
    public int incrementDeathCount() {
        currentDeatCount = fragStatistics.incrementDeathCount();
        displayFregDeathRatio();
        return currentDeatCount;
    }

    @Override
    public void reset() {
        fragStatistics.reset();
    }
}
