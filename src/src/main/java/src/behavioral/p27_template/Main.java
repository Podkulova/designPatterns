package src.behavioral.p27_template;

public class Main {
    public static void main(String[] args) {
        PerformanceTestTemplate testTemplate = new RandomListSortingPerformancetest();
        testTemplate.run();

        System.out.println("-----------------------------");

        testTemplate = new StringBuilderAppendPerformacetest();
        testTemplate.run();
    }
}
