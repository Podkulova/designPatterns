package src.p07_factory_method;

public class BoardGame implements Game{
    private String name;
    private String type;
    private int minPlayerNumber;
    private int maxPlayerNumber;

    public BoardGame(String name, String type, int minPlayerNumber, int maxPlayerNumber) {
        this.name = name;
        this.type = type;
        this.minPlayerNumber = minPlayerNumber;
        this.maxPlayerNumber = maxPlayerNumber;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getMinNumberOfPlayers() {
        return this.minPlayerNumber;
    }

    @Override
    public int getmaxNumberOfPlayers() {
        return this.maxPlayerNumber;
    }

    @Override
    public boolean canByPlayedRemotely() {
        return false;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", minPlayerNumber=" + minPlayerNumber +
                ", maxPlayerNumber=" + maxPlayerNumber +
                '}';
    }
}
