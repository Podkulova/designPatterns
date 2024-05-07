package src.behavioral.p19_interpreter;

public class MathOperationWithoutPriorityInterpreter implements Interpreter {
    private final MathOperationApplier mathOperationApplier;

    public MathOperationWithoutPriorityInterpreter(MathOperationApplier mathOperationApplier) {
        this.mathOperationApplier = mathOperationApplier;
    }

    @Override
    public String interpret(String context) {
        // 2 + 5 * 3 => {'2', + '+', '5', '*', '3'}
        final String[] splitContext = context.trim().split(" ");

        Double value = Double.valueOf(splitContext[0]);

        for (int i = 1; i < splitContext.length - 1; i += 2) {
            value = mathOperationApplier.apply(extractOperation(splitContext[i]), value, Double.valueOf(splitContext[i + 1]));
        }
        return value.toString();
    }

    private MathOperation extractOperation(final String operation) throws UnsupportedOperationException {
        return switch (operation) {
            case "+" -> MathOperation.ADD;
            case "-" -> MathOperation.SUBTRACT;
            case "*" -> MathOperation.MULTIPLY;
            case "/" -> MathOperation.DIVIDE;
            case "**" -> MathOperation.EXPONENTIATION;
            default -> {
                throw new UnsupportedOperationException();
            }
        };
    }
}
