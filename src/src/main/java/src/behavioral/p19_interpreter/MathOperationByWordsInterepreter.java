package src.behavioral.p19_interpreter;

public class MathOperationByWordsInterepreter implements Interpreter {
    private final MathOperationApplier mathOperationApplier;

    public MathOperationByWordsInterepreter(MathOperationApplier mathOperationApplier) {
        this.mathOperationApplier = mathOperationApplier;
    }

    @Override
    public String interpret(String context) {
        // 2 add 5 multiply 3
        final String[] splitContext = context.trim().split(" ");

        Double value = Double.valueOf(splitContext[0]);

        for (int i = 1; i < splitContext.length - 1; i += 2) {
            value = mathOperationApplier.apply(extractOperation(splitContext[i]), value, Double.valueOf(splitContext[i + 1]));
        }
        return value.toString();
    }

    private MathOperation extractOperation(final String operation) {
        return MathOperation.valueOf(operation);
    }
}
