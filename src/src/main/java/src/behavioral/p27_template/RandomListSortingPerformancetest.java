package src.behavioral.p27_template;

import java.util.*;

public class RandomListSortingPerformancetest extends PerformanceTestTemplate {
    private static final int NUMBER_NUM = 100000;

    @Override
    protected int getWarmUpIterationsNum() {
        return 2;
    }

    @Override
    protected int getIterationsNum() {
        return 100;
    }

    @Override
    protected void iteration() {
        final List<Integer> integers = new ArrayList<>();
        final Random random = new Random();

        for (int i = 0; i < NUMBER_NUM; i++) {
            integers.add(random.nextInt());
        }
        Collections.sort(integers);
    }
}
