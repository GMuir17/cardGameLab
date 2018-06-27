import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Deck deck;
    Card card1;
    Card card2;

    @Before
    public void Before() {
        game = new Game("Eliminator");
        player1 = new Player("Magda");
        player2 = new Player("Gary");
        deck = new Deck();
        card1 = new Card(SuitType.CLUBS, RankType.QUEEN);
        card2 = new Card(SuitType.HEARTS, RankType.FIVE);
    }

    @Test
    public void hasName() {
        assertEquals("Eliminator", game.getName());
    }

}
