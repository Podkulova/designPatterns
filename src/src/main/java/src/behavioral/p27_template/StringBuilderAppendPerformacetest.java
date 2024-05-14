package src.behavioral.p27_template;

import java.util.Collections;
import java.util.Random;

public class StringBuilderAppendPerformacetest extends PerformanceTestTemplate {

    private static final int CHARS_NUM = 100000;

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
        final Random random = new Random();
        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < CHARS_NUM; i++) {
            stringBuilder.append(Math.abs(random.nextInt() % 128));
        }
    }
}
