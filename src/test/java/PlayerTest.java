import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void Before() {
        player = new Player("Magda");
        card = new Card(SuitType.HEARTS, RankType.FIVE);
    }

    @Test
    public void canGetName() {
        assertEquals("Magda", player.getName());
    }

    @Test
    public void handStartsEmpty() {
        assertEquals(0, player.countHand());
    }

    @Test
    public void canAddCardToHand() {
       player.addCardToHand(card);
       assertEquals(1, player.countHand());
    }
}
