package src.behavioral.p26_strategy;

public class SpacesModificationStrategyProvider {
    public SpacesModificationStrategy get(final StrategyType strategyType) {
        switch (strategyType) {
            case REPLACE:
                return new StrategyReplaceWithUnderscore();
            case REMOVE:
                return new StrategyRemoveSpaces();
            case DOUBLE:
                return new StrategyDoubleSpaces();
        }
        throw new UnsupportedOperationException("Unsupported strategy type.");
    }
}
