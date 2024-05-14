package src.behavioral.p27_template;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class PerformanceTestTemplate {
    protected abstract int getWarmUpIterationsNum();

    protected abstract int getIterationsNum();

    protected abstract void iteration();

    public final void run() {
        for (int wwarmUpIterationIndex = 0; wwarmUpIterationIndex < getWarmUpIterationsNum(); wwarmUpIterationIndex++) {
            iteration();
        }

        final List<Long> iterationsExecutionTimes = new ArrayList<>();

        for (int iterationIndex = 0; iterationIndex < getIterationsNum(); iterationIndex++) {
            long startTimeStamp = System.currentTimeMillis();
            iteration();
            long endTimeStamp = System.currentTimeMillis();
            iterationsExecutionTimes.add(endTimeStamp - startTimeStamp);
        }
        showStatistics(iterationsExecutionTimes);
    }

    private Long calculateShortestIteration(final List<Long> iterationsDurations) {
        return iterationsDurations.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow();
    }

    private Long calculateLongestIteration(final List<Long> iterationsDurations) {
        return iterationsDurations.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow();
    }

    private Long calculateTotalExecutionTime(final List<Long> iterationsDurations) {
        return iterationsDurations.stream().mapToLong(x -> x).sum();
    }

    private void showStatistics(final List<Long> iterationsExecutionTimes) {
        System.out.println("Shortest iteration took: " + calculateShortestIteration(iterationsExecutionTimes));
        System.out.println("Longest iteration took: " + calculateLongestIteration(iterationsExecutionTimes));
        System.out.println("All iterations took: " + calculateTotalExecutionTime(iterationsExecutionTimes));
    }


}
