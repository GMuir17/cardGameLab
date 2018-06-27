public class Game {

    private String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void createDeck(Deck deck) {
        for (SuitType suit : SuitType.values()){

            for (RankType rank : RankType.values()) {

                Card card = new Card(suit, rank);
                deck.addCard(card);
            }
        }
    }

}
