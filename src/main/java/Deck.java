import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public int cardCount() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public Card removeCard() {
      return this.cards.remove(0);
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }
}
