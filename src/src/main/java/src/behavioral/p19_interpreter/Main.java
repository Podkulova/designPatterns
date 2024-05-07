package src.behavioral.p19_interpreter;

public class Main {
    public static void main(String[] args) {
        final MathOperationApplier mathOperationApplier = new MathOperationApplier();

        // Interpretace pro 2 5 5 * 3
        Interpreter interpreter = new MathOperationWithoutPriorityInterpreter(mathOperationApplier);

        String example = "2 + 5 * 3";
        String result = interpreter.interpret(example);
        System.out.println(example.trim() + " = " + result);

        interpreter = new MathOperationByWordsInterepreter(mathOperationApplier);
        example = "2 ADD 5 MULTIPLY 3";
        result = interpreter.interpret(example);
        System.out.println(example.trim() + " = " + result);
    }
}
