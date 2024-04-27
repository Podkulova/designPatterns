package src.creational.p07_factory_method;

public class PCGame implements Game {
    private String name;
    private String type;
    private int minPlayerNumber;
    private int maxPlayerNumber;
    private boolean isOnline;

    public PCGame(String name, String type, int minPlayerNumber, int maxPlayerNumber, boolean isOnline) {
        this.name = name;
        this.type = type;
        this.minPlayerNumber = minPlayerNumber;
        this.maxPlayerNumber = maxPlayerNumber;
        this.isOnline = isOnline;
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
        return this.isOnline;
    }

    @Override
    public String toString() {
        return "PCGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", minPlayerNumber=" + minPlayerNumber +
                ", maxPlayerNumber=" + maxPlayerNumber +
                ", isOnline=" + isOnline +

                '}';
    }
}
