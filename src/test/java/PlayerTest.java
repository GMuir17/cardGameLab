import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card1;
    Card card2;

    @Before
    public void Before() {
        player = new Player("Magda");
        card1 = new Card(SuitType.HEARTS, RankType.FIVE);
        card2 = new Card(SuitType.HEARTS, RankType.TWO);
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
       player.addCardToHand(card1);
       assertEquals(1, player.countHand());
    }

    @Test
    public void canAddTogetherValuesOfCardsInHand() {
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        assertEquals(7, player.totalHandValue());
    }

}
