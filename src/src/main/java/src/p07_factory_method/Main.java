package src.p07_factory_method;

public class Main {
    public static void main(String[] args) {
/*        BoardGame monopoly = new BoardGame("Monopoly", "Family", 2, 4 );
        System.out.println(monopoly);

        GameFactory gameFactory = new MonopolyGameCreator();
        Game game = gameFactory.create();
        System.out.println(game);

        GameFactory gameFactory2 = new ValorantGameCreator();
        Game game2 = gameFactory2.create();
        System.out.println(game2);*/

        String gameName = "Settlers";

        GameFactory gameFactory;

        if (gameName.equals("Monopoly")) {
            gameFactory = new MonopolyGameCreator();
        } else if (gameName.equals("Valorant")) {
            gameFactory = new ValorantGameCreator();
        } else if (gameName.equals("Settlers")) {
            gameFactory = new SettlersGameCreator();
        } else {
            throw new RuntimeException("Unoknown game name");
        }
        Game game = gameFactory.create();
        System.out.println(game);
    }

}
