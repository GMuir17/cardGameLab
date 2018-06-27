import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;
    Card card2;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(SuitType.DIAMONDS, RankType.FIVE);
        card2 = new Card(SuitType.SPADES, RankType.EIGHT);

    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canAddCard() {
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
    }

    @Test
    public void canRemoveCard() {
        deck.addCard(card);
        deck.removeCard();
        assertEquals(0, deck.cardCount());
    }


}
