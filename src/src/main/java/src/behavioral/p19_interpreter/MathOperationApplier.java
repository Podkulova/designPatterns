package src.behavioral.p19_interpreter;

public class MathOperationApplier {

    public Double apply(final MathOperation mathOperation, final Double firts, final Double second) {
        return switch (mathOperation) {
            case ADD -> firts + second;
            case SUBTRACT -> firts - second;
            case MULTIPLY -> firts * second;
            case DIVIDE -> firts / second;
            case EXPONENTIATION -> Math.pow(firts, second);
        };
    }
}
