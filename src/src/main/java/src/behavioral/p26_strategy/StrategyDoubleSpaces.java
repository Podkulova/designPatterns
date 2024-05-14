package src.behavioral.p26_strategy;

public class StrategyDoubleSpaces implements SpacesModificationStrategy {
    @Override
    public String modify(String input) {
        final StringBuilder stringBuilder = new StringBuilder(input.length());

        for (final char c : input.toCharArray()) {
            if (c != ' ') {
                stringBuilder.append(c);
            } else {
                stringBuilder.append("  ");
            }
        }
        return stringBuilder.toString();
    }
}
